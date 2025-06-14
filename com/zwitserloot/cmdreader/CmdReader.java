package com.zwitserloot.cmdreader;

/* loaded from: com.usidqw.qwerklj.apk:com/zwitserloot/cmdreader/CmdReader.SCL.lombok */
public class CmdReader<T> {
    private final java.lang.Class<T> settingsDescriptor;
    private final java.util.List<com.zwitserloot.cmdreader.ParseItem> items;
    private final java.util.Map<java.lang.Character, com.zwitserloot.cmdreader.ParseItem> shorthands;
    private final java.util.List<com.zwitserloot.cmdreader.ParseItem> seqList;
    private static final int SCREEN_WIDTH = 72;


    private CmdReader(java.lang.Class<T> r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.settingsDescriptor = r1
            r0 = r3
            r1 = r3
            java.util.List r1 = r1.init()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.items = r1
            r0 = r3
            r1 = r3
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r1 = r1.items
            java.util.Map r1 = com.zwitserloot.cmdreader.ParseItem.makeShortHandMap(r1)
            r0.shorthands = r1
            r0 = r3
            r1 = r3
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r1 = r1.items
            java.util.List r1 = makeSeqList(r1)
            r0.seqList = r1
            return
    }

    /* renamed from: of */
    public static <T> com.zwitserloot.cmdreader.CmdReader<T> m40of(java.lang.Class<T> r4) {
            com.zwitserloot.cmdreader.CmdReader r0 = new com.zwitserloot.cmdreader.CmdReader
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    private java.util.List<com.zwitserloot.cmdreader.ParseItem> init() {
            r5 = this;
            r0 = r5
            java.lang.Class<T> r0 = r0.settingsDescriptor
            r6 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
        Ld:
            r0 = r6
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L67
            r0 = r5
            java.lang.Class<T> r0 = r0.settingsDescriptor
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L27:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L5f
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            r1 = 1
            r0.setAccessible(r1)
            r0 = r12
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L49
            goto L59
        L49:
            r0 = r7
            com.zwitserloot.cmdreader.ParseItem r1 = new com.zwitserloot.cmdreader.ParseItem
            r2 = r1
            r3 = r12
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
        L59:
            int r11 = r11 + 1
            goto L27
        L5f:
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()
            r6 = r0
            goto Ld
        L67:
            r0 = r7
            com.zwitserloot.cmdreader.ParseItem.multiSanityChecks(r0)
            r0 = r7
            return r0
    }

    private static java.util.List<com.zwitserloot.cmdreader.ParseItem> makeSeqList(java.util.List<com.zwitserloot.cmdreader.ParseItem> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        Lf:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L34
            r0 = r5
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r6 = r0
            r0 = r6
            boolean r0 = r0.isSeq()
            if (r0 == 0) goto L31
            r0 = r4
            r1 = r6
            boolean r0 = r0.add(r1)
        L31:
            goto Lf
        L34:
            r0 = r4
            return r0
    }

    public java.lang.String generateCommandLineHelp(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r5
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L18:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L66
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0.isSeq()
            if (r0 == 0) goto L39
            goto L18
        L39:
            r0 = r8
            r1 = r11
            java.lang.String r1 = r1.getFullName()
            int r1 = r1.length()
            r2 = r11
            boolean r2 = r2.isParameterized()
            if (r2 == 0) goto L4e
            r2 = 4
            goto L4f
        L4e:
            r2 = 0
        L4f:
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r8 = r0
            r0 = r9
            r1 = r11
            java.lang.String r1 = r1.getShorthand()
            int r1 = r1.length()
            int r0 = java.lang.Math.max(r0, r1)
            r9 = r0
            goto L18
        L66:
            r0 = r9
            if (r0 != 0) goto L6e
            int r9 = r9 + 1
        L6e:
            r0 = r9
            r1 = 3
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r0.generateShortSummary(r1, r2)
            r0 = r5
            r1 = r7
            r0.generateSequentialArgsHelp(r1)
            r0 = r5
            r1 = r8
            r2 = r9
            r3 = r7
            r0.generateMandatoryArgsHelp(r1, r2, r3)
            r0 = r5
            r1 = r8
            r2 = r9
            r3 = r7
            r0.generateOptionalArgsHelp(r1, r2, r3)
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void generateShortSummary(java.lang.String r4, java.lang.StringBuilder r5) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L16
            r0 = r4
            int r0 = r0.length()
            if (r0 <= 0) goto L16
            r0 = r5
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r3
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L29:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5c
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0.isSeq()
            if (r0 != 0) goto L59
            r0 = r8
            boolean r0 = r0.isMandatory()
            if (r0 != 0) goto L59
            r0 = r6
            r1 = r8
            java.lang.String r1 = r1.getShorthand()
            java.lang.StringBuilder r0 = r0.append(r1)
        L59:
            goto L29
        L5c:
            r0 = r6
            int r0 = r0.length()
            if (r0 <= 0) goto L78
            r0 = r5
            java.lang.String r1 = "[-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 0
            r0.setLength(r1)
        L78:
            r0 = r3
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L83:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lb6
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0.isSeq()
            if (r0 != 0) goto Lb3
            r0 = r8
            boolean r0 = r0.isMandatory()
            if (r0 == 0) goto Lb3
            r0 = r6
            r1 = r8
            java.lang.String r1 = r1.getShorthand()
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb3:
            goto L83
        Lb6:
            r0 = r6
            int r0 = r0.length()
            if (r0 <= 0) goto Ld2
            r0 = r5
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 0
            r0.setLength(r1)
        Ld2:
            r0 = r3
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        Ldd:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L125
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0.isSeq()
            if (r0 != 0) goto L122
            r0 = r8
            boolean r0 = r0.isMandatory()
            if (r0 == 0) goto L122
            r0 = r8
            java.lang.String r0 = r0.getShorthand()
            int r0 = r0.length()
            if (r0 != 0) goto L122
            r0 = r5
            java.lang.String r1 = "--"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.String r1 = r1.getFullName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "=val "
            java.lang.StringBuilder r0 = r0.append(r1)
        L122:
            goto Ldd
        L125:
            r0 = r3
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L130:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L180
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0.isSeq()
            if (r0 == 0) goto L17d
            r0 = r8
            boolean r0 = r0.isMandatory()
            if (r0 != 0) goto L15d
            r0 = r5
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
        L15d:
            r0 = r5
            r1 = r8
            java.lang.String r1 = r1.getFullName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            boolean r0 = r0.isMandatory()
            if (r0 != 0) goto L176
            r0 = r5
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
        L176:
            r0 = r5
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
        L17d:
            goto L130
        L180:
            r0 = r5
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    private void generateSequentialArgsHelp(java.lang.StringBuilder r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L12:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L45
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r9 = r0
            r0 = r9
            boolean r0 = r0.isSeq()
            if (r0 == 0) goto L42
            r0 = r9
            java.lang.String r0 = r0.getFullDescription()
            int r0 = r0.length()
            if (r0 <= 0) goto L42
            r0 = r7
            r1 = r9
            boolean r0 = r0.add(r1)
        L42:
            goto L12
        L45:
            r0 = r7
            int r0 = r0.size()
            if (r0 != 0) goto L4f
            return
        L4f:
            r0 = 0
            r8 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L59:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L7f
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r10 = r0
            r0 = r8
            r1 = r10
            java.lang.String r1 = r1.getFullName()
            int r1 = r1.length()
            int r0 = java.lang.Math.max(r0, r1)
            r8 = r0
            goto L59
        L7f:
            r0 = r6
            java.lang.String r1 = "\n  Sequential arguments:\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L8e:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Laf
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r10 = r0
            r0 = r5
            r1 = r8
            r2 = r10
            r3 = r6
            r0.generateSequentialArgHelp(r1, r2, r3)
            goto L8e
        Laf:
            return
    }

    private void generateMandatoryArgsHelp(int r7, int r8, java.lang.StringBuilder r9) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r6
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L14:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L47
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r12 = r0
            r0 = r12
            boolean r0 = r0.isMandatory()
            if (r0 == 0) goto L44
            r0 = r12
            boolean r0 = r0.isSeq()
            if (r0 != 0) goto L44
            r0 = r10
            r1 = r12
            boolean r0 = r0.add(r1)
        L44:
            goto L14
        L47:
            r0 = r10
            int r0 = r0.size()
            if (r0 != 0) goto L52
            return
        L52:
            r0 = r9
            java.lang.String r1 = "\n  Mandatory arguments:\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L62:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L84
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r12
            r4 = r9
            r0.generateArgHelp(r1, r2, r3, r4)
            goto L62
        L84:
            return
    }

    private void generateOptionalArgsHelp(int r7, int r8, java.lang.StringBuilder r9) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r6
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L14:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L47
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r12 = r0
            r0 = r12
            boolean r0 = r0.isMandatory()
            if (r0 != 0) goto L44
            r0 = r12
            boolean r0 = r0.isSeq()
            if (r0 != 0) goto L44
            r0 = r10
            r1 = r12
            boolean r0 = r0.add(r1)
        L44:
            goto L14
        L47:
            r0 = r10
            int r0 = r0.size()
            if (r0 != 0) goto L52
            return
        L52:
            r0 = r9
            java.lang.String r1 = "\n  Optional arguments:\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L62:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L84
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r12
            r4 = r9
            r0.generateArgHelp(r1, r2, r3, r4)
            goto L62
        L84:
            return
    }

    private void generateArgHelp(int r8, int r9, com.zwitserloot.cmdreader.ParseItem r10, java.lang.StringBuilder r11) {
            r7 = this;
            r0 = r11
            java.lang.String r1 = "    "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.String r1 = r1.getFullName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            boolean r1 = r1.isParameterized()
            if (r1 == 0) goto L22
            java.lang.String r1 = "=val"
            goto L24
        L22:
            java.lang.String r1 = ""
        L24:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12 = r0
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "--%-"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "s "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r12
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r10
            java.lang.String r0 = r0.getShorthand()
            char[] r0 = r0.toCharArray()
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r16 = r0
        L70:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto La1
            r0 = r14
            r1 = r16
            char r0 = r0[r1]
            r17 = r0
            r0 = r13
            int r0 = r0.length()
            if (r0 <= 0) goto L8e
            r0 = r13
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
        L8e:
            r0 = r13
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)
            int r16 = r16 + 1
            goto L70
        La1:
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "%-"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "s "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 64
            r1 = r9
            int r0 = r0 - r1
            r1 = r8
            int r0 = r0 - r1
            r14 = r0
            r0 = r10
            java.lang.String r0 = r0.getFullDescription()
            r15 = r0
            r0 = r15
            int r0 = r0.length()
            if (r0 == 0) goto Leb
            r0 = r15
            int r0 = r0.length()
            r1 = r14
            if (r0 >= r1) goto Lf9
        Leb:
            r0 = r11
            r1 = r15
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            return
        Lf9:
            r0 = r10
            java.lang.String r0 = r0.getFullDescription()
            r1 = 64
            java.util.List r0 = wordbreak(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
        L109:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L12f
            r0 = r16
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r17 = r0
            r0 = r11
            java.lang.String r1 = "\n        "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L109
        L12f:
            r0 = r11
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    private void generateSequentialArgHelp(int r8, com.zwitserloot.cmdreader.ParseItem r9, java.lang.StringBuilder r10) {
            r7 = this;
            r0 = r10
            java.lang.String r1 = "    "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "%-"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "s   "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r9
            java.lang.String r5 = r5.getFullName()
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 65
            r1 = r8
            int r0 = r0 - r1
            r11 = r0
            r0 = r9
            java.lang.String r0 = r0.getFullDescription()
            r12 = r0
            r0 = r12
            int r0 = r0.length()
            if (r0 == 0) goto L50
            r0 = r12
            int r0 = r0.length()
            r1 = r11
            if (r0 >= r1) goto L5d
        L50:
            r0 = r10
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            return
        L5d:
            r0 = r9
            java.lang.String r0 = r0.getFullDescription()
            r1 = 64
            java.util.List r0 = wordbreak(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
        L6d:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L92
            r0 = r13
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r14 = r0
            r0 = r10
            java.lang.String r1 = "\n        "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L6d
        L92:
            r0 = r10
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    private static java.util.List<java.lang.String> wordbreak(java.lang.String r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = -1
            r9 = r0
            r0 = r5
            char[] r0 = r0.toCharArray()
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L21:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto Lb1
            r0 = r10
            r1 = r12
            char r0 = r0[r1]
            r13 = r0
            r0 = r13
            r1 = 9
            if (r0 != r1) goto L3a
            r0 = 32
            r13 = r0
        L3a:
            r0 = r13
            r1 = 10
            if (r0 != r1) goto L57
            r0 = r8
            r1 = r7
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r7
            r1 = 0
            r0.setLength(r1)
            r0 = -1
            r9 = r0
            goto Lab
        L57:
            r0 = r13
            r1 = 32
            if (r0 != r1) goto L6e
            r0 = r7
            int r0 = r0.length()
            r9 = r0
            r0 = r7
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L75
        L6e:
            r0 = r7
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
        L75:
            r0 = r7
            int r0 = r0.length()
            r1 = r6
            if (r0 <= r1) goto Lab
            r0 = r9
            r1 = 8
            if (r0 <= r1) goto Lab
            r0 = r8
            r1 = r7
            r2 = 0
            r3 = r9
            java.lang.String r1 = r1.substring(r2, r3)
            boolean r0 = r0.add(r1)
            r0 = r7
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r14 = r0
            r0 = r7
            r1 = 0
            r0.setLength(r1)
            r0 = r7
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = -1
            r9 = r0
        Lab:
            int r12 = r12 + 1
            goto L21
        Lb1:
            r0 = r7
            int r0 = r0.length()
            if (r0 <= 0) goto Lc3
            r0 = r8
            r1 = r7
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        Lc3:
            r0 = r8
            return r0
    }

    public T make(java.lang.String r5) throws com.zwitserloot.cmdreader.InvalidCommandLineException, java.lang.IllegalArgumentException {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r5
            char[] r0 = r0.toCharArray()
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L24:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto Lab
            r0 = r10
            r1 = r12
            char r0 = r0[r1]
            r13 = r0
            r0 = r9
            if (r0 == 0) goto L4b
            r0 = 0
            r9 = r0
            r0 = r13
            r1 = 10
            if (r0 != r1) goto L44
            goto La5
        L44:
            r0 = r7
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
        L4b:
            r0 = r13
            r1 = 92
            if (r0 != r1) goto L58
            r0 = 1
            r9 = r0
            goto La5
        L58:
            r0 = r13
            r1 = 34
            if (r0 != r1) goto L6e
            r0 = r8
            if (r0 != 0) goto L68
            r0 = 1
            goto L69
        L68:
            r0 = 0
        L69:
            r8 = r0
            goto La5
        L6e:
            r0 = r13
            r1 = 32
            if (r0 != r1) goto L9e
            r0 = r8
            if (r0 != 0) goto L9e
            r0 = r7
            java.lang.String r0 = r0.toString()
            r14 = r0
            r0 = r7
            r1 = 0
            r0.setLength(r1)
            r0 = r14
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L92
            goto La5
        L92:
            r0 = r6
            r1 = r14
            boolean r0 = r0.add(r1)
            goto La5
        L9e:
            r0 = r7
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
        La5:
            int r12 = r12 + 1
            goto L24
        Lab:
            r0 = r7
            int r0 = r0.length()
            if (r0 <= 0) goto Lbd
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        Lbd:
            r0 = r4
            r1 = r6
            r2 = r6
            int r2 = r2.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Object r0 = r0.make(r1)
            return r0
    }

    public T make(java.lang.String[] r10) throws com.zwitserloot.cmdreader.InvalidCommandLineException {
            r9 = this;
            r0 = r9
            java.lang.Object r0 = r0.construct()
            r11 = r0
            r0 = r10
            if (r0 != 0) goto Le
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r10 = r0
        Le:
            r0 = 0
            r12 = r0
            com.zwitserloot.cmdreader.CmdReader$1State r0 = new com.zwitserloot.cmdreader.CmdReader$1State
            r1 = r0
            r2 = r9
            r3 = r11
            r1.<init>(r2, r3)
            r13 = r0
            r0 = 0
            r14 = r0
        L1e:
            r0 = r14
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L2c1
            r0 = r10
            r1 = r14
            r0 = r0[r1]
            java.lang.String r1 = "--"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L163
            r0 = r10
            r1 = r14
            r0 = r0[r1]
            r1 = 61
            int r0 = r0.indexOf(r1)
            r15 = r0
            r0 = r15
            r1 = -1
            if (r0 != r1) goto L4d
            r0 = r10
            r1 = r14
            r0 = r0[r1]
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            goto L57
        L4d:
            r0 = r10
            r1 = r14
            r0 = r0[r1]
            r1 = 2
            r2 = r15
            java.lang.String r0 = r0.substring(r1, r2)
        L57:
            r16 = r0
            r0 = r15
            r1 = -1
            if (r0 != r1) goto L64
            java.lang.String r0 = ""
            goto L6f
        L64:
            r0 = r10
            r1 = r14
            r0 = r0[r1]
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
        L6f:
            r17 = r0
            r0 = r17
            int r0 = r0.length()
            if (r0 != 0) goto L9d
            r0 = r15
            r1 = -1
            if (r0 == r1) goto L9d
            com.zwitserloot.cmdreader.InvalidCommandLineException r0 = new com.zwitserloot.cmdreader.InvalidCommandLineException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "invalid command line argument - you should write something after the '=': "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            r4 = r14
            r3 = r3[r4]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L9d:
            r0 = 0
            r18 = r0
            r0 = r9
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            java.util.Iterator r0 = r0.iterator()
            r19 = r0
        Lab:
            r0 = r19
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L13d
            r0 = r19
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r20 = r0
            r0 = r20
            java.lang.String r0 = r0.getFullName()
            r1 = r16
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13a
            r0 = r20
            boolean r0 = r0.isParameterized()
            if (r0 == 0) goto L117
            r0 = r17
            int r0 = r0.length()
            if (r0 != 0) goto L117
            r0 = r14
            r1 = r10
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L101
            r0 = r10
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            java.lang.String r1 = "-"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L101
            r0 = r10
            int r14 = r14 + 1
            r1 = r14
            r0 = r0[r1]
            r17 = r0
            goto L117
        L101:
            com.zwitserloot.cmdreader.InvalidCommandLineException r0 = new com.zwitserloot.cmdreader.InvalidCommandLineException
            r1 = r0
            java.lang.String r2 = "invalid command line argument - %s requires a parameter but there is none."
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r16
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L117:
            r0 = r13
            r1 = r20
            r2 = r20
            boolean r2 = r2.isParameterized()
            if (r2 != 0) goto L12f
            r2 = r17
            int r2 = r2.length()
            if (r2 != 0) goto L12f
            r2 = 0
            goto L131
        L12f:
            r2 = r17
        L131:
            r0.handle(r1, r2)
            r0 = 1
            r18 = r0
            goto L13d
        L13a:
            goto Lab
        L13d:
            r0 = r18
            if (r0 != 0) goto L160
            com.zwitserloot.cmdreader.InvalidCommandLineException r0 = new com.zwitserloot.cmdreader.InvalidCommandLineException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "invalid command line argument - I don't know about that option: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            r4 = r14
            r3 = r3[r4]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L160:
            goto L2bb
        L163:
            r0 = r10
            r1 = r14
            r0 = r0[r1]
            java.lang.String r1 = "-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L22b
            r0 = r10
            r1 = r14
            r0 = r0[r1]
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
            char[] r0 = r0.toCharArray()
            r15 = r0
            r0 = r15
            int r0 = r0.length
            r16 = r0
            r0 = 0
            r17 = r0
        L184:
            r0 = r17
            r1 = r16
            if (r0 >= r1) goto L228
            r0 = r15
            r1 = r17
            char r0 = r0[r1]
            r18 = r0
            r0 = r9
            java.util.Map<java.lang.Character, com.zwitserloot.cmdreader.ParseItem> r0 = r0.shorthands
            r1 = r18
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r19 = r0
            r0 = r19
            if (r0 != 0) goto L1ca
            com.zwitserloot.cmdreader.InvalidCommandLineException r0 = new com.zwitserloot.cmdreader.InvalidCommandLineException
            r1 = r0
            java.lang.String r2 = "invalid command line argument - %s is not a known option: %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r18
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r10
            r7 = r14
            r6 = r6[r7]
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L1ca:
            r0 = r19
            boolean r0 = r0.isParameterized()
            if (r0 == 0) goto L21a
            r0 = r14
            r1 = r10
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L1f5
            r0 = r10
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            java.lang.String r1 = "-"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L1f5
            r0 = r10
            int r14 = r14 + 1
            r1 = r14
            r0 = r0[r1]
            r20 = r0
            goto L20e
        L1f5:
            com.zwitserloot.cmdreader.InvalidCommandLineException r0 = new com.zwitserloot.cmdreader.InvalidCommandLineException
            r1 = r0
            java.lang.String r2 = "invalid command line argument - %s requires a parameter but there is none."
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r18
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L20e:
            r0 = r13
            r1 = r19
            r2 = r20
            r0.handle(r1, r2)
            goto L222
        L21a:
            r0 = r13
            r1 = r19
            r2 = 0
            r0.handle(r1, r2)
        L222:
            int r17 = r17 + 1
            goto L184
        L228:
            goto L2bb
        L22b:
            int r12 = r12 + 1
            r0 = r9
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.seqList
            int r0 = r0.size()
            r1 = r12
            if (r0 >= r1) goto L29f
            r0 = r9
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.seqList
            int r0 = r0.size()
            if (r0 <= 0) goto L287
            r0 = r9
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.seqList
            r1 = r9
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r1 = r1.seqList
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            boolean r0 = r0.isCollection()
            if (r0 == 0) goto L287
            r0 = r13
            r1 = r9
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r1 = r1.seqList
            r2 = r9
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r2 = r2.seqList
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r1 = r1.get(r2)
            com.zwitserloot.cmdreader.ParseItem r1 = (com.zwitserloot.cmdreader.ParseItem) r1
            r2 = r10
            r3 = r14
            r2 = r2[r3]
            r0.handle(r1, r2)
            goto L2bb
        L287:
            com.zwitserloot.cmdreader.InvalidCommandLineException r0 = new com.zwitserloot.cmdreader.InvalidCommandLineException
            r1 = r0
            java.lang.String r2 = "invalid command line argument - you've provided too many free-standing arguments: %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r10
            r7 = r14
            r6 = r6[r7]
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L29f:
            r0 = r9
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.seqList
            r1 = r12
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r15 = r0
            r0 = r13
            r1 = r15
            r2 = r10
            r3 = r14
            r2 = r2[r3]
            r0.handle(r1, r2)
        L2bb:
            int r14 = r14 + 1
            goto L1e
        L2c1:
            r0 = r13
            r0.finish()
            r0 = r11
            return r0
    }

    private T construct() {
            r8 = this;
            r0 = r8
            java.lang.Class<T> r0 = r0.settingsDescriptor     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L57
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L57
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L57
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L57
            r0 = r9
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L57
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L57
            return r0
        L1a:
            r9 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "A CmdReader class must have a no-args constructor: %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.Class<T> r6 = r6.settingsDescriptor
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L33:
            r9 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "A CmdReader class must not be an interface or abstract: %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.Class<T> r6 = r6.settingsDescriptor
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L4c:
            r9 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Huh?"
            r1.<init>(r2)
            throw r0
        L57:
            r9 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Exception occurred when constructing CmdReader class "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.Class<T> r3 = r3.settingsDescriptor
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r9
            java.lang.Throwable r3 = r3.getCause()
            r1.<init>(r2, r3)
            throw r0
    }

    public static java.lang.String squash(java.util.Collection<java.lang.String> r3) {
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
        Lf:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L39
            r0 = r5
            r1 = r4
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lf
            r0 = r5
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf
        L39:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    static /* synthetic */ java.util.List access$000(com.zwitserloot.cmdreader.CmdReader r2) {
            r0 = r2
            java.util.List<com.zwitserloot.cmdreader.ParseItem> r0 = r0.items
            return r0
    }
}
