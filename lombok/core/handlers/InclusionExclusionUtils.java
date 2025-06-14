package lombok.core.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/handlers/InclusionExclusionUtils.SCL.lombok */
public class InclusionExclusionUtils {



    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/handlers/InclusionExclusionUtils$Included.SCL.lombok */
    public static class Included<L, I extends java.lang.annotation.Annotation> {
        private final L node;
        private final I inc;
        private final boolean defaultInclude;
        private final boolean explicitRank;

        public Included(L r4, I r5, boolean r6, boolean r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.node = r1
                r0 = r3
                r1 = r5
                r0.inc = r1
                r0 = r3
                r1 = r6
                r0.defaultInclude = r1
                r0 = r3
                r1 = r7
                r0.explicitRank = r1
                return
        }

        public L getNode() {
                r2 = this;
                r0 = r2
                L r0 = r0.node
                return r0
        }

        public I getInc() {
                r2 = this;
                r0 = r2
                I extends java.lang.annotation.Annotation r0 = r0.inc
                return r0
        }

        public boolean isDefaultInclude() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.defaultInclude
                return r0
        }

        public boolean hasExplicitRank() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.explicitRank
                return r0
        }

        static /* synthetic */ java.lang.Object access$0(lombok.core.handlers.InclusionExclusionUtils.Included r2) {
                r0 = r2
                L r0 = r0.node
                return r0
        }
    }

    public InclusionExclusionUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.util.List<java.lang.Integer> createListOfNonExistentFields(java.util.List<java.lang.String> r4, lombok.core.LombokNode<?, ?, ?> r5, boolean r6, boolean r7) {
            r0 = r4
            int r0 = r0.size()
            boolean[] r0 = new boolean[r0]
            r8 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L83
        L16:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r9 = r0
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            goto L8d
        L2e:
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L3c
            goto L83
        L3c:
            r0 = r6
            if (r0 == 0) goto L5b
            r0 = r9
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L4b
            goto L83
        L4b:
            r0 = r9
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L5b
            goto L83
        L5b:
            r0 = r7
            if (r0 == 0) goto L6a
            r0 = r9
            boolean r0 = r0.isTransient()
            if (r0 == 0) goto L6a
            goto L83
        L6a:
            r0 = r4
            r1 = r9
            java.lang.String r1 = r1.getName()
            int r0 = r0.indexOf(r1)
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 <= r1) goto L83
            r0 = r8
            r1 = r11
            r2 = 1
            r0[r1] = r2
        L83:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L16
        L8d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = 0
            r10 = r0
            goto Lb4
        L9c:
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            if (r0 != 0) goto Lb1
            r0 = r9
            r1 = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        Lb1:
            int r10 = r10 + 1
        Lb4:
            r0 = r10
            r1 = r4
            int r1 = r1.size()
            if (r0 < r1) goto L9c
            r0 = r9
            return r0
    }

    public static void checkForBogusFieldNames(lombok.core.LombokNode<?, ?, ?> r5, lombok.core.AnnotationValues<?> r6, java.util.List<java.lang.String> r7, java.util.List<java.lang.String> r8) {
            r0 = r7
            if (r0 == 0) goto L45
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L45
            r0 = r7
            r1 = r5
            r2 = 1
            r3 = 0
            java.util.List r0 = createListOfNonExistentFields(r0, r1, r2, r3)
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L3b
        L1e:
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L3b
            r0 = r6
            java.lang.String r1 = "exclude"
            java.lang.String r2 = "This field does not exist, or would have been excluded anyway."
            r3 = r9
            r0.setWarning(r1, r2, r3)
        L3b:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1e
        L45:
            r0 = r8
            if (r0 == 0) goto L8a
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8a
            r0 = r8
            r1 = r5
            r2 = 0
            r3 = 0
            java.util.List r0 = createListOfNonExistentFields(r0, r1, r2, r3)
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L80
        L63:
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L80
            r0 = r6
            java.lang.String r1 = "of"
            java.lang.String r2 = "This field does not exist."
            r3 = r9
            r0.setWarning(r1, r2, r3)
        L80:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L63
        L8a:
            return
    }

    private static java.lang.String innerAnnName(java.lang.Class<? extends java.lang.annotation.Annotation> r4) {
            r0 = r4
            java.lang.String r0 = r0.getSimpleName()
            r5 = r0
            r0 = r4
            java.lang.Class r0 = r0.getEnclosingClass()
            r6 = r0
            goto L2d
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5 = r0
            r0 = r6
            java.lang.Class r0 = r0.getEnclosingClass()
            r6 = r0
        L2d:
            r0 = r6
            if (r0 != 0) goto Ld
            r0 = r5
            return r0
    }

    private static <A extends lombok.core.AST<A, L, N>, L extends lombok.core.LombokNode<A, L, N>, N, I extends java.lang.annotation.Annotation> java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<L, I>> handleIncludeExcludeMarking(java.lang.Class<I> r9, java.lang.String r10, java.lang.Class<? extends java.lang.annotation.Annotation> r11, lombok.core.LombokNode<A, L, N> r12, lombok.core.AnnotationValues<?> r13, lombok.core.LombokNode<A, L, N> r14, boolean r15) {
            r0 = r13
            if (r0 == 0) goto Lf
            r0 = r13
            java.lang.String r1 = "onlyExplicitlyIncluded"
            boolean r0 = r0.getAsBoolean(r1)
            goto L10
        Lf:
            r0 = 0
        L10:
            r16 = r0
            r0 = r9
            r1 = r16
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            java.util.List r0 = handleIncludeExcludeMarking(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    private static <A extends lombok.core.AST<A, L, N>, L extends lombok.core.LombokNode<A, L, N>, N, I extends java.lang.annotation.Annotation> java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<L, I>> handleIncludeExcludeMarking(java.lang.Class<I> r9, boolean r10, java.lang.String r11, java.lang.Class<? extends java.lang.annotation.Annotation> r12, lombok.core.LombokNode<A, L, N> r13, lombok.core.AnnotationValues<?> r14, lombok.core.LombokNode<A, L, N> r15, boolean r16) {
            r0 = r14
            if (r0 == 0) goto L19
            r0 = r14
            java.lang.String r1 = "exclude"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto L19
            r0 = r14
            java.lang.String r1 = "exclude"
            java.util.List r0 = r0.getAsStringList(r1)
            goto L1a
        L19:
            r0 = 0
        L1a:
            r17 = r0
            r0 = r14
            if (r0 == 0) goto L35
            r0 = r14
            java.lang.String r1 = "of"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto L35
            r0 = r14
            java.lang.String r1 = "of"
            java.util.List r0 = r0.getAsStringList(r1)
            goto L36
        L35:
            r0 = 0
        L36:
            r18 = r0
            r0 = r10
            r19 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r20 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r13
            if (r0 == 0) goto L5d
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L5f
        L5d:
            r0 = 0
            return r0
        L5f:
            r0 = r13
            r1 = r14
            r2 = r17
            r3 = r18
            checkForBogusFieldNames(r0, r1, r2, r3)
            r0 = r17
            if (r0 == 0) goto L85
            r0 = r18
            if (r0 == 0) goto L85
            r0 = 0
            r17 = r0
            r0 = r14
            if (r0 == 0) goto L85
            r0 = r14
            java.lang.String r1 = "exclude"
            java.lang.String r2 = "exclude and of are mutually exclusive; the 'exclude' parameter will be ignored."
            r0.setWarning(r1, r2)
        L85:
            r0 = r13
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r23 = r0
            goto L287
        L92:
            r0 = r23
            java.lang.Object r0 = r0.next()
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r22 = r0
            r0 = r22
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto Lb6
            r0 = r22
            r1 = r12
            boolean r0 = r0.hasAnnotation(r1)
            if (r0 == 0) goto Lb6
            r0 = 1
            goto Lb7
        Lb6:
            r0 = 0
        Lb7:
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = r22
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Ld2
            r0 = r22
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto Lda
        Ld2:
            r0 = r22
            r1 = r9
            lombok.core.AnnotationValues r0 = r0.findAnnotation(r1)
            r25 = r0
        Lda:
            r0 = r24
            if (r0 != 0) goto Le4
            r0 = r25
            if (r0 == 0) goto Le7
        Le4:
            r0 = 1
            r19 = r0
        Le7:
            r0 = r25
            if (r0 == 0) goto L11d
            r0 = r24
            if (r0 == 0) goto L11d
            r0 = r22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "@"
            r2.<init>(r3)
            r2 = r12
            java.lang.String r2 = innerAnnName(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " and @"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.String r2 = innerAnnName(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " are mutually exclusive; the @Include annotation will be ignored"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = 0
            r25 = r0
        L11d:
            r0 = r22
            java.lang.String r0 = r0.getName()
            r26 = r0
            r0 = r24
            if (r0 == 0) goto L15d
            r0 = r10
            if (r0 == 0) goto L137
            r0 = r22
            java.lang.String r1 = "The @Exclude annotation is not needed; 'onlyExplicitlyIncluded' is set, so this member would be excluded anyway"
            r0.addWarning(r1)
            goto L287
        L137:
            r0 = r22
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L149
            r0 = r22
            java.lang.String r1 = "The @Exclude annotation is not needed; static fields aren't included anyway"
            r0.addWarning(r1)
            goto L287
        L149:
            r0 = r26
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L287
            r0 = r22
            java.lang.String r1 = "The @Exclude annotation is not needed; fields that start with $ aren't included anyway"
            r0.addWarning(r1)
            goto L287
        L15d:
            r0 = r17
            if (r0 == 0) goto L171
            r0 = r17
            r1 = r26
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L171
            goto L287
        L171:
            r0 = r25
            if (r0 == 0) goto L1f8
            r0 = r25
            java.lang.annotation.Annotation r0 = r0.getInstance()
            r27 = r0
            r0 = r22
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L1d9
            r0 = r22
            int r0 = r0.countMethodParameters()
            if (r0 <= 0) goto L1b1
            r0 = r22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Methods included with @"
            r2.<init>(r3)
            r2 = r9
            java.lang.String r2 = innerAnnName(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must have no arguments; it will not be included"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            goto L287
        L1b1:
            r0 = r11
            if (r0 == 0) goto L1be
            r0 = r25
            r1 = r11
            java.lang.String r0 = r0.getAsString(r1)
            goto L1c1
        L1be:
            java.lang.String r0 = ""
        L1c1:
            r28 = r0
            r0 = r28
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1cf
            r0 = r26
            r28 = r0
        L1cf:
            r0 = r21
            r1 = r28
            boolean r0 = r0.add(r1)
        L1d9:
            r0 = r20
            lombok.core.handlers.InclusionExclusionUtils$Included r1 = new lombok.core.handlers.InclusionExclusionUtils$Included
            r2 = r1
            r3 = r22
            r4 = r27
            r5 = 0
            r6 = r25
            java.lang.String r7 = "rank"
            boolean r6 = r6.isExplicit(r7)
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
            goto L287
        L1f8:
            r0 = r10
            if (r0 == 0) goto L1ff
            goto L287
        L1ff:
            r0 = r18
            if (r0 == 0) goto L232
            r0 = r22
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L287
            r0 = r18
            r1 = r26
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L287
            r0 = r20
            lombok.core.handlers.InclusionExclusionUtils$Included r1 = new lombok.core.handlers.InclusionExclusionUtils$Included
            r2 = r1
            r3 = r22
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
            goto L287
        L232:
            r0 = r22
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L240
            goto L287
        L240:
            r0 = r22
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L24b
            goto L287
        L24b:
            r0 = r22
            boolean r0 = r0.isTransient()
            if (r0 == 0) goto L25b
            r0 = r16
            if (r0 != 0) goto L25b
            goto L287
        L25b:
            r0 = r26
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L268
            goto L287
        L268:
            r0 = r22
            boolean r0 = r0.isEnumMember()
            if (r0 == 0) goto L273
            goto L287
        L273:
            r0 = r20
            lombok.core.handlers.InclusionExclusionUtils$Included r1 = new lombok.core.handlers.InclusionExclusionUtils$Included
            r2 = r1
            r3 = r22
            r4 = 0
            r5 = 1
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L287:
            r0 = r23
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L92
            r0 = r20
            java.util.Iterator r0 = r0.iterator()
            r22 = r0
            goto L2cd
        L29d:
            r0 = r22
            java.lang.Object r0 = r0.next()
            lombok.core.handlers.InclusionExclusionUtils$Included r0 = (lombok.core.handlers.InclusionExclusionUtils.Included) r0
            r23 = r0
            r0 = r23
            boolean r0 = r0.isDefaultInclude()
            if (r0 == 0) goto L2cd
            r0 = r21
            r1 = r23
            java.lang.Object r1 = r1.getNode()
            lombok.core.LombokNode r1 = (lombok.core.LombokNode) r1
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2cd
            r0 = r22
            r0.remove()
        L2cd:
            r0 = r22
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L29d
            r0 = r14
            if (r0 == 0) goto L2e6
            r0 = r14
            java.lang.String r1 = "exclude"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L2e9
        L2e6:
            r0 = 0
            r17 = r0
        L2e9:
            r0 = r14
            if (r0 == 0) goto L2f8
            r0 = r14
            java.lang.String r1 = "of"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L2fb
        L2f8:
            r0 = 0
            r18 = r0
        L2fb:
            r0 = r19
            if (r0 == 0) goto L314
            r0 = r17
            if (r0 != 0) goto L30a
            r0 = r18
            if (r0 == 0) goto L314
        L30a:
            r0 = r15
            java.lang.String r1 = "The old-style 'exclude/of' parameter cannot be used together with the new-style @Include / @Exclude annotations."
            r0.addError(r1)
            r0 = 0
            return r0
        L314:
            r0 = r20
            return r0
    }

    public static <A extends lombok.core.AST<A, L, N>, L extends lombok.core.LombokNode<A, L, N>, N> java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<L, lombok.ToString.Include>> handleToStringMarking(lombok.core.LombokNode<A, L, N> r9, boolean r10, lombok.core.AnnotationValues<lombok.ToString> r11, lombok.core.LombokNode<A, L, N> r12) {
            java.lang.Class<lombok.ToString$Include> r0 = lombok.ToString.Include.class
            r1 = r10
            java.lang.String r2 = "name"
            java.lang.Class<lombok.ToString$Exclude> r3 = lombok.ToString.Exclude.class
            r4 = r9
            r5 = r11
            r6 = r12
            r7 = 1
            java.util.List r0 = handleIncludeExcludeMarking(r0, r1, r2, r3, r4, r5, r6, r7)
            r13 = r0
            r0 = r13
            lombok.core.handlers.InclusionExclusionUtils$1 r1 = new lombok.core.handlers.InclusionExclusionUtils$1
            r2 = r1
            r2.<init>()
            java.util.Collections.sort(r0, r1)
            r0 = r13
            return r0
    }

    public static <A extends lombok.core.AST<A, L, N>, L extends lombok.core.LombokNode<A, L, N>, N> java.util.List<lombok.core.handlers.InclusionExclusionUtils.Included<L, lombok.EqualsAndHashCode.Include>> handleEqualsAndHashCodeMarking(lombok.core.LombokNode<A, L, N> r8, lombok.core.AnnotationValues<lombok.EqualsAndHashCode> r9, lombok.core.LombokNode<A, L, N> r10) {
            java.lang.Class<lombok.EqualsAndHashCode$Include> r0 = lombok.EqualsAndHashCode.Include.class
            java.lang.String r1 = "replaces"
            java.lang.Class<lombok.EqualsAndHashCode$Exclude> r2 = lombok.EqualsAndHashCode.Exclude.class
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = 0
            java.util.List r0 = handleIncludeExcludeMarking(r0, r1, r2, r3, r4, r5, r6)
            r11 = r0
            r0 = r11
            lombok.core.handlers.InclusionExclusionUtils$2 r1 = new lombok.core.handlers.InclusionExclusionUtils$2
            r2 = r1
            r2.<init>()
            java.util.Collections.sort(r0, r1)
            r0 = r11
            return r0
    }

    private static <A extends lombok.core.AST<A, L, N>, L extends lombok.core.LombokNode<A, L, N>, N> int compareRankOrPosition(int r3, int r4, lombok.core.LombokNode<A, L, N> r5, lombok.core.LombokNode<A, L, N> r6) {
            r0 = r3
            r1 = r4
            if (r0 >= r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r3
            r1 = r4
            if (r0 <= r1) goto Le
            r0 = -1
            return r0
        Le:
            r0 = r5
            int r0 = r0.getStartPos()
            r7 = r0
            r0 = r6
            int r0 = r0.getStartPos()
            r8 = r0
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L23
            r0 = -1
            return r0
        L23:
            r0 = r7
            r1 = r8
            if (r0 <= r1) goto L2c
            r0 = 1
            return r0
        L2c:
            r0 = 0
            return r0
    }

    static /* synthetic */ int access$0(int r5, int r6, lombok.core.LombokNode r7, lombok.core.LombokNode r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = compareRankOrPosition(r0, r1, r2, r3)
            return r0
    }
}
