package com.zwitserloot.cmdreader;

/* loaded from: com.usidqw.qwerklj.apk:com/zwitserloot/cmdreader/ParseItem.SCL.lombok */
class ParseItem {
    private final java.util.List<java.lang.Class<?>> LEGAL_CLASSES;
    private final java.lang.reflect.Field field;
    private final boolean isCollection;
    private final java.lang.Class<?> type;
    private final java.lang.String fullName;
    private final boolean isSeq;
    private final boolean isParameterized;
    private final boolean isMandatory;
    private final java.lang.String shorthand;
    private final java.lang.String description;
    private final java.util.List<java.lang.String> excludes;
    private final java.util.List<java.lang.String> mandatoryIf;
    private final java.util.List<java.lang.String> mandatoryIfNot;
    private final java.util.List<java.lang.String> requires;
    private static final java.util.List<java.lang.Class<?>> ARRAY_LIST_COMPATIBLES = null;
    private static final java.util.List<java.lang.Class<?>> HASH_SET_COMPATIBLES = null;
    private static final java.util.List<java.lang.Class<?>> LINKED_LIST_COMPATIBLES = null;
    private java.util.List<java.lang.String> TRUE_VALS;
    private java.util.List<java.lang.String> FALSE_VALS;

    ParseItem(java.lang.reflect.Field r9) {
            r8 = this;
            r0 = r8
            r0.<init>()
            r0 = r8
            r1 = 10
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            r2[r3] = r4
            r2 = r1
            r3 = 2
            java.lang.Class<java.lang.Short> r4 = java.lang.Short.class
            r2[r3] = r4
            r2 = r1
            r3 = 3
            java.lang.Class<java.lang.Byte> r4 = java.lang.Byte.class
            r2[r3] = r4
            r2 = r1
            r3 = 4
            java.lang.Class<java.lang.Float> r4 = java.lang.Float.class
            r2[r3] = r4
            r2 = r1
            r3 = 5
            java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
            r2[r3] = r4
            r2 = r1
            r3 = 6
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r2[r3] = r4
            r2 = r1
            r3 = 7
            java.lang.Class<java.lang.Character> r4 = java.lang.Character.class
            r2[r3] = r4
            r2 = r1
            r3 = 8
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            r2 = r1
            r3 = 9
            java.lang.Class<java.lang.Enum> r4 = java.lang.Enum.class
            r2[r3] = r4
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.LEGAL_CLASSES = r1
            r0 = r8
            r1 = 6
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "1"
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.String r4 = "true"
            r2[r3] = r4
            r2 = r1
            r3 = 2
            java.lang.String r4 = "t"
            r2[r3] = r4
            r2 = r1
            r3 = 3
            java.lang.String r4 = "y"
            r2[r3] = r4
            r2 = r1
            r3 = 4
            java.lang.String r4 = "yes"
            r2[r3] = r4
            r2 = r1
            r3 = 5
            java.lang.String r4 = "on"
            r2[r3] = r4
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.TRUE_VALS = r1
            r0 = r8
            r1 = 6
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "0"
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.String r4 = "false"
            r2[r3] = r4
            r2 = r1
            r3 = 2
            java.lang.String r4 = "f"
            r2[r3] = r4
            r2 = r1
            r3 = 3
            java.lang.String r4 = "n"
            r2[r3] = r4
            r2 = r1
            r3 = 4
            java.lang.String r4 = "no"
            r2[r3] = r4
            r2 = r1
            r3 = 5
            java.lang.String r4 = "off"
            r2[r3] = r4
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.FALSE_VALS = r1
            r0 = r8
            r1 = r9
            r0.field = r1
            r0 = r9
            r1 = 1
            r0.setAccessible(r1)
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            r1 = r9
            java.lang.Class r1 = r1.getType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L11f
            r0 = r8
            r1 = 1
            r0.isCollection = r1
            r0 = r9
            java.lang.reflect.Type r0 = r0.getGenericType()
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r11
            boolean r0 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Le3
            r0 = r11
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r12 = r0
        Le3:
            r0 = r12
            if (r0 == 0) goto L104
            r0 = r12
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L104
            r0 = r12
            r1 = 0
            r0 = r0[r1]
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L104
            r0 = r12
            r1 = 0
            r0 = r0[r1]
            java.lang.Class r0 = (java.lang.Class) r0
            r10 = r0
            goto L11c
        L104:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Only primitives, Strings, Enums, and Collections of those are allowed (for type: %s)"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            java.lang.reflect.Type r6 = r6.getGenericType()
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L11c:
            goto L129
        L11f:
            r0 = r8
            r1 = 0
            r0.isCollection = r1
            r0 = r9
            java.lang.Class r0 = r0.getType()
            r10 = r0
        L129:
            r0 = r10
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L13a
            r0 = r8
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r0.type = r1
            goto L1b6
        L13a:
            r0 = r10
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L14b
            r0 = r8
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            r0.type = r1
            goto L1b6
        L14b:
            r0 = r10
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L15c
            r0 = r8
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            r0.type = r1
            goto L1b6
        L15c:
            r0 = r10
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L16d
            r0 = r8
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            r0.type = r1
            goto L1b6
        L16d:
            r0 = r10
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L17e
            r0 = r8
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            r0.type = r1
            goto L1b6
        L17e:
            r0 = r10
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L18f
            r0 = r8
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            r0.type = r1
            goto L1b6
        L18f:
            r0 = r10
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L1a0
            r0 = r8
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            r0.type = r1
            goto L1b6
        L1a0:
            r0 = r10
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L1b1
            r0 = r8
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            r0.type = r1
            goto L1b6
        L1b1:
            r0 = r8
            r1 = r10
            r0.type = r1
        L1b6:
            r0 = r8
            java.util.List<java.lang.Class<?>> r0 = r0.LEGAL_CLASSES
            r1 = r8
            java.lang.Class<?> r1 = r1.type
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1e4
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Not a valid class for command line parsing: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.reflect.Type r3 = r3.getGenericType()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1e4:
            r0 = r8
            r1 = r8
            r2 = r9
            java.lang.String r1 = r1.setupFullName(r2)
            r0.fullName = r1
            r0 = r8
            r1 = r9
            java.lang.Class<com.zwitserloot.cmdreader.Sequential> r2 = com.zwitserloot.cmdreader.Sequential.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            if (r1 == 0) goto L1fc
            r1 = 1
            goto L1fd
        L1fc:
            r1 = 0
        L1fd:
            r0.isSeq = r1
            r0 = r8
            r1 = r9
            java.lang.Class r1 = r1.getType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 == r2) goto L219
            r1 = r9
            java.lang.Class r1 = r1.getType()
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r1 == r2) goto L219
            r1 = 1
            goto L21a
        L219:
            r1 = 0
        L21a:
            r0.isParameterized = r1
            r0 = r8
            r1 = r8
            r2 = r9
            java.lang.String r1 = r1.setupShorthand(r2)
            r0.shorthand = r1
            r0 = r8
            r1 = r8
            r2 = r9
            java.lang.String r1 = r1.setupDescription(r2)
            r0.description = r1
            r0 = r8
            r1 = r8
            r2 = r9
            boolean r1 = r1.setupMandatory(r2)
            r0.isMandatory = r1
            r0 = r8
            r1 = r8
            r2 = r9
            java.util.List r1 = r1.setupMandatoryIf(r2)
            r0.mandatoryIf = r1
            r0 = r8
            r1 = r8
            r2 = r9
            java.util.List r1 = r1.setupMandatoryIfNot(r2)
            r0.mandatoryIfNot = r1
            r0 = r8
            r1 = r8
            r2 = r9
            java.util.List r1 = r1.setupRequires(r2)
            r0.requires = r1
            r0 = r8
            r1 = r8
            r2 = r9
            java.util.List r1 = r1.setupExcludes(r2)
            r0.excludes = r1
            r0 = r8
            r0.sanityChecks()     // Catch: java.lang.IllegalArgumentException -> L263
            goto L283
        L263:
            r11 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "%s (at %s)"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r11
            java.lang.String r6 = r6.getMessage()
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r8
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L283:
            return
    }

    private void sanityChecks() {
            r4 = this;
            r0 = r4
            boolean r0 = r0.isParameterized
            if (r0 != 0) goto L1b
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 == r1) goto L1b
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Non-parameterized parameters must have type boolean. - it's there (true), or not (false)."
            r1.<init>(r2)
            throw r0
        L1b:
            r0 = r4
            boolean r0 = r0.isParameterized
            if (r0 != 0) goto L33
            r0 = r4
            boolean r0 = r0.isMandatory
            if (r0 == 0) goto L33
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Non-parameterized parameters must not be mandatory - what's the point of having it?"
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r4
            boolean r0 = r0.isSeq
            if (r0 == 0) goto L50
            java.lang.String r0 = ""
            r1 = r4
            java.lang.String r1 = r1.shorthand
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "sequential parameters must not have any shorthands."
            r1.<init>(r2)
            throw r0
        L50:
            r0 = r4
            boolean r0 = r0.isSeq
            if (r0 == 0) goto L68
            r0 = r4
            boolean r0 = r0.isParameterized
            if (r0 != 0) goto L68
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "sequential parameters must always be parameterized."
            r1.<init>(r2)
            throw r0
        L68:
            return
    }

    static void multiSanityChecks(java.util.List<com.zwitserloot.cmdreader.ParseItem> r9) {
            r0 = r9
            int r0 = r0.size()
            r10 = r0
            r0 = 0
            r11 = r0
        L9:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L7a
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r12 = r0
        L12:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto L74
            r0 = r9
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            java.lang.String r0 = r0.fullName
            r1 = r9
            r2 = r12
            java.lang.Object r1 = r1.get(r2)
            com.zwitserloot.cmdreader.ParseItem r1 = (com.zwitserloot.cmdreader.ParseItem) r1
            java.lang.String r1 = r1.fullName
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L6e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Duplicate full names for fields %s and %s."
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            r7 = r11
            java.lang.Object r6 = r6.get(r7)
            com.zwitserloot.cmdreader.ParseItem r6 = (com.zwitserloot.cmdreader.ParseItem) r6
            java.lang.reflect.Field r6 = r6.field
            java.lang.String r6 = r6.getName()
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r9
            r7 = r12
            java.lang.Object r6 = r6.get(r7)
            com.zwitserloot.cmdreader.ParseItem r6 = (com.zwitserloot.cmdreader.ParseItem) r6
            java.lang.reflect.Field r6 = r6.field
            java.lang.String r6 = r6.getName()
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L6e:
            int r12 = r12 + 1
            goto L12
        L74:
            int r11 = r11 + 1
            goto L9
        L7a:
            r0 = 0
            r11 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        L83:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Ld9
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r13 = r0
            r0 = r13
            boolean r0 = r0.isSeq
            if (r0 == 0) goto Lc3
            r0 = r11
            if (r0 == 0) goto Lc3
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "After the sequential, collection item %s no more sequential items allowed (at %s)"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r11
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r13
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        Lc3:
            r0 = r13
            boolean r0 = r0.isSeq
            if (r0 == 0) goto Ld6
            r0 = r13
            boolean r0 = r0.isCollection
            if (r0 == 0) goto Ld6
            r0 = r13
            r11 = r0
        Ld6:
            goto L83
        Ld9:
            r0 = 0
            r12 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
        Le3:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L142
            r0 = r13
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r14 = r0
            r0 = r14
            boolean r0 = r0.isSeq
            if (r0 != 0) goto L104
            goto Le3
        L104:
            r0 = r12
            if (r0 != 0) goto L113
            r0 = r14
            boolean r0 = r0.isMandatory
            if (r0 != 0) goto L113
            r0 = r14
            r12 = r0
        L113:
            r0 = r14
            boolean r0 = r0.isMandatory
            if (r0 == 0) goto L13f
            r0 = r12
            if (r0 == 0) goto L13f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Sequential item %s is non-mandatory, so %s which is a later sequential item must also be non-mandatory"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r12
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r14
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L13f:
            goto Le3
        L142:
            return
    }

    static java.util.Map<java.lang.Character, com.zwitserloot.cmdreader.ParseItem> makeShortHandMap(java.util.List<com.zwitserloot.cmdreader.ParseItem> r9) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        Lf:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L99
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.zwitserloot.cmdreader.ParseItem r0 = (com.zwitserloot.cmdreader.ParseItem) r0
            r12 = r0
            r0 = r12
            java.lang.String r0 = r0.shorthand
            char[] r0 = r0.toCharArray()
            r13 = r0
            r0 = r13
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r15 = r0
        L33:
            r0 = r15
            r1 = r14
            if (r0 >= r1) goto L96
            r0 = r13
            r1 = r15
            char r0 = r0[r1]
            r16 = r0
            r0 = r10
            r1 = r16
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L83
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Both %s and %s contain the shorthand %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r10
            r7 = r16
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            java.lang.Object r6 = r6.get(r7)
            com.zwitserloot.cmdreader.ParseItem r6 = (com.zwitserloot.cmdreader.ParseItem) r6
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r12
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r16
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L83:
            r0 = r10
            r1 = r16
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r2 = r12
            java.lang.Object r0 = r0.put(r1, r2)
            int r15 = r15 + 1
            goto L33
        L96:
            goto Lf
        L99:
            r0 = r10
            return r0
    }

    java.lang.String getFullName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.fullName
            return r0
    }

    boolean isSeq() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isSeq
            return r0
    }

    boolean isMandatory() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isMandatory
            return r0
    }

    java.util.List<java.lang.String> getMandatoryIf() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.mandatoryIf
            return r0
    }

    java.util.List<java.lang.String> getMandatoryIfNot() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.mandatoryIfNot
            return r0
    }

    java.util.List<java.lang.String> getRequires() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.requires
            return r0
    }

    java.util.List<java.lang.String> getExcludes() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.excludes
            return r0
    }

    boolean isParameterized() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isParameterized
            return r0
    }

    boolean isCollection() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isCollection
            return r0
    }

    java.lang.String getFullDescription() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.description
            return r0
    }

    void set(java.lang.Object r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r7
            java.lang.Object r0 = r0.stringToObject(r1)
            r8 = r0
            r0 = r5
            boolean r0 = r0.isCollection     // Catch: java.lang.IllegalAccessException -> Lc1
            if (r0 == 0) goto Lb5
            r0 = r5
            java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> Lc1
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.IllegalAccessException -> Lc1
            r9 = r0
            r0 = r9
            if (r0 != 0) goto La9
            java.util.List<java.lang.Class<?>> r0 = com.zwitserloot.cmdreader.ParseItem.ARRAY_LIST_COMPATIBLES     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r5
            java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.IllegalAccessException -> Lc1
            java.lang.Class r1 = r1.getType()     // Catch: java.lang.IllegalAccessException -> Lc1
            boolean r0 = r0.contains(r1)     // Catch: java.lang.IllegalAccessException -> Lc1
            if (r0 == 0) goto L3d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r0
            r1.<init>()     // Catch: java.lang.IllegalAccessException -> Lc1
            r9 = r0
            goto L9f
        L3d:
            java.util.List<java.lang.Class<?>> r0 = com.zwitserloot.cmdreader.ParseItem.LINKED_LIST_COMPATIBLES     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r5
            java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.IllegalAccessException -> Lc1
            java.lang.Class r1 = r1.getType()     // Catch: java.lang.IllegalAccessException -> Lc1
            boolean r0 = r0.contains(r1)     // Catch: java.lang.IllegalAccessException -> Lc1
            if (r0 == 0) goto L5b
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r0
            r1.<init>()     // Catch: java.lang.IllegalAccessException -> Lc1
            r9 = r0
            goto L9f
        L5b:
            java.util.List<java.lang.Class<?>> r0 = com.zwitserloot.cmdreader.ParseItem.HASH_SET_COMPATIBLES     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r5
            java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.IllegalAccessException -> Lc1
            java.lang.Class r1 = r1.getType()     // Catch: java.lang.IllegalAccessException -> Lc1
            boolean r0 = r0.contains(r1)     // Catch: java.lang.IllegalAccessException -> Lc1
            if (r0 == 0) goto L79
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r0
            r1.<init>()     // Catch: java.lang.IllegalAccessException -> Lc1
            r9 = r0
            goto L9f
        L79:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Lc1
            r3 = r2
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> Lc1
            java.lang.String r3 = "Cannot construct a collection of type "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalAccessException -> Lc1
            r3 = r5
            java.lang.reflect.Field r3 = r3.field     // Catch: java.lang.IllegalAccessException -> Lc1
            java.lang.Class r3 = r3.getType()     // Catch: java.lang.IllegalAccessException -> Lc1
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalAccessException -> Lc1
            java.lang.String r3 = " -- try List, Set, Collection, or Queue."
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalAccessException -> Lc1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.IllegalAccessException -> Lc1
            r1.<init>(r2)     // Catch: java.lang.IllegalAccessException -> Lc1
            throw r0     // Catch: java.lang.IllegalAccessException -> Lc1
        L9f:
            r0 = r5
            java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r6
            r2 = r9
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lc1
        La9:
            r0 = r9
            r1 = r8
            boolean r0 = r0.add(r1)     // Catch: java.lang.IllegalAccessException -> Lc1
            goto Lbe
        Lb5:
            r0 = r5
            java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.IllegalAccessException -> Lc1
            r1 = r6
            r2 = r8
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lc1
        Lbe:
            goto Lcd
        Lc1:
            r9 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Huh?"
            r1.<init>(r2)
            throw r0
        Lcd:
            return
    }

    private java.lang.Object stringToObject(java.lang.String r5) {
            r4 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto Lc
            r0 = r5
            return r0
        Lc:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto L1e
            r0 = r5
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L1e:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto L30
            r0 = r5
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L30:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto L42
            r0 = r5
            short r0 = java.lang.Short.parseShort(r0)
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
        L42:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto L54
            r0 = r5
            byte r0 = java.lang.Byte.parseByte(r0)
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L54:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto L66
            r0 = r5
            float r0 = java.lang.Float.parseFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L66:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto L78
            r0 = r5
            double r0 = java.lang.Double.parseDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L78:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto L93
            r0 = r5
            if (r0 != 0) goto L8a
            r0 = 1
            goto L8f
        L8a:
            r0 = r4
            r1 = r5
            boolean r0 = r0.parseBoolean(r1)
        L8f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L93:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto Lb1
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto La8
            r0 = 0
            goto Lad
        La8:
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
        Lad:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        Lb1:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            r1 = r4
            java.lang.Class<?> r1 = r1.type
            if (r0 != r1) goto Lc4
            r0 = r4
            java.lang.Class<?> r0 = r0.type
            r1 = r5
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            return r0
        Lc4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Huh?"
            r1.<init>(r2)
            throw r0
    }

    private java.lang.String setupFullName(java.lang.reflect.Field r6) {
            r5 = this;
            r0 = r6
            java.lang.Class<com.zwitserloot.cmdreader.FullName> r1 = com.zwitserloot.cmdreader.FullName.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.zwitserloot.cmdreader.FullName r0 = (com.zwitserloot.cmdreader.FullName) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L14
            r0 = r6
            java.lang.String r0 = r0.getName()
            return r0
        L14:
            r0 = r7
            java.lang.String r0 = r0.value()
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Missing name for field: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L43:
            r0 = r7
            java.lang.String r0 = r0.value()
            return r0
    }

    private java.lang.String setupShorthand(java.lang.reflect.Field r9) {
            r8 = this;
            r0 = r9
            java.lang.Class<com.zwitserloot.cmdreader.Shorthand> r1 = com.zwitserloot.cmdreader.Shorthand.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.zwitserloot.cmdreader.Shorthand r0 = (com.zwitserloot.cmdreader.Shorthand) r0
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L12
            java.lang.String r0 = ""
            return r0
        L12:
            r0 = r10
            java.lang.String[] r0 = r0.value()
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r11
            r13 = r0
            r0 = r13
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r15 = r0
        L2d:
            r0 = r15
            r1 = r14
            if (r0 >= r1) goto Lbd
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            r16 = r0
            r0 = r16
            char[] r0 = r0.toCharArray()
            r17 = r0
            r0 = r17
            int r0 = r0.length
            r1 = 1
            if (r0 == r1) goto L66
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Shorthands must be strings of 1 character long. (%s at %s)"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r16
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r8
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r17
            r1 = 0
            char r0 = r0[r1]
            r1 = 45
            if (r0 != r1) goto L87
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The dash (-) is not a legal shorthand character. (at %s)"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        L87:
            r0 = r12
            r1 = r16
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 <= r1) goto Laf
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Duplicate shorthand: %s (at %s)"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r16
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r8
            java.lang.String r6 = r6.fullName
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        Laf:
            r0 = r12
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)
            int r15 = r15 + 1
            goto L2d
        Lbd:
            r0 = r12
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String setupDescription(java.lang.reflect.Field r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            java.lang.Class<com.zwitserloot.cmdreader.Description> r1 = com.zwitserloot.cmdreader.Description.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.zwitserloot.cmdreader.Description r0 = (com.zwitserloot.cmdreader.Description) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L22
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.value()
            java.lang.StringBuilder r0 = r0.append(r1)
        L22:
            r0 = r3
            boolean r0 = r0.isCollection
            if (r0 == 0) goto L41
            r0 = r5
            r1 = r5
            int r1 = r1.length()
            if (r1 <= 0) goto L36
            java.lang.String r1 = "  "
            goto L38
        L36:
            java.lang.String r1 = ""
        L38:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "This option may be used multiple times."
            java.lang.StringBuilder r0 = r0.append(r1)
        L41:
            r0 = r3
            boolean r0 = r0.isParameterized
            if (r0 == 0) goto L132
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 == r1) goto L132
            r0 = r5
            int r0 = r0.length()
            if (r0 <= 0) goto L60
            r0 = r5
            java.lang.String r1 = "  "
            java.lang.StringBuilder r0 = r0.append(r1)
        L60:
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 == r1) goto L74
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto L7b
        L74:
            r0 = r5
            java.lang.String r1 = "value is a floating point number."
            java.lang.StringBuilder r0 = r0.append(r1)
        L7b:
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 == r1) goto La3
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r0 == r1) goto La3
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r0 == r1) goto La3
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r0 != r1) goto Laa
        La3:
            r0 = r5
            java.lang.String r1 = "value is an integer."
            java.lang.StringBuilder r0 = r0.append(r1)
        Laa:
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r0 != r1) goto Lbb
            r0 = r5
            java.lang.String r1 = "value is 'true' or 'false'."
            java.lang.StringBuilder r0 = r0.append(r1)
        Lbb:
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            if (r0 != r1) goto Lcc
            r0 = r5
            java.lang.String r1 = "Value is a single character."
            java.lang.StringBuilder r0 = r0.append(r1)
        Lcc:
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            if (r0 != r1) goto L132
            r0 = r5
            java.lang.String r1 = "value is one of: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r7 = r0
            r0 = r3
            java.lang.Class<?> r0 = r0.type
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        Lfb:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L12b
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r7
            if (r0 == 0) goto L114
            r0 = 0
            r7 = r0
            goto L11b
        L114:
            r0 = r5
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L11b:
            r0 = r5
            r1 = r12
            java.lang.String r1 = r1.name()
            java.lang.StringBuilder r0 = r0.append(r1)
            int r11 = r11 + 1
            goto Lfb
        L12b:
            r0 = r5
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
        L132:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    private boolean setupMandatory(java.lang.reflect.Field r4) {
            r3 = this;
            r0 = r4
            java.lang.Class<com.zwitserloot.cmdreader.Mandatory> r1 = com.zwitserloot.cmdreader.Mandatory.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.zwitserloot.cmdreader.Mandatory r0 = (com.zwitserloot.cmdreader.Mandatory) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L27
            r0 = r5
            java.lang.String[] r0 = r0.onlyIf()
            int r0 = r0.length
            if (r0 != 0) goto L27
            r0 = r5
            java.lang.String[] r0 = r0.onlyIfNot()
            int r0 = r0.length
            if (r0 != 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    private java.util.List<java.lang.String> setupMandatoryIf(java.lang.reflect.Field r4) {
            r3 = this;
            r0 = r4
            java.lang.Class<com.zwitserloot.cmdreader.Mandatory> r1 = com.zwitserloot.cmdreader.Mandatory.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.zwitserloot.cmdreader.Mandatory r0 = (com.zwitserloot.cmdreader.Mandatory) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L19
            r0 = r5
            java.lang.String[] r0 = r0.onlyIf()
            int r0 = r0.length
            if (r0 != 0) goto L1d
        L19:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L1d:
            r0 = r5
            java.lang.String[] r0 = r0.onlyIf()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    private java.util.List<java.lang.String> setupMandatoryIfNot(java.lang.reflect.Field r4) {
            r3 = this;
            r0 = r4
            java.lang.Class<com.zwitserloot.cmdreader.Mandatory> r1 = com.zwitserloot.cmdreader.Mandatory.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.zwitserloot.cmdreader.Mandatory r0 = (com.zwitserloot.cmdreader.Mandatory) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L19
            r0 = r5
            java.lang.String[] r0 = r0.onlyIfNot()
            int r0 = r0.length
            if (r0 != 0) goto L1d
        L19:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L1d:
            r0 = r5
            java.lang.String[] r0 = r0.onlyIfNot()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    private java.util.List<java.lang.String> setupRequires(java.lang.reflect.Field r4) {
            r3 = this;
            r0 = r3
            java.lang.reflect.Field r0 = r0.field
            java.lang.Class<com.zwitserloot.cmdreader.Requires> r1 = com.zwitserloot.cmdreader.Requires.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.zwitserloot.cmdreader.Requires r0 = (com.zwitserloot.cmdreader.Requires) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1c
            r0 = r5
            java.lang.String[] r0 = r0.value()
            int r0 = r0.length
            if (r0 != 0) goto L20
        L1c:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L20:
            r0 = r5
            java.lang.String[] r0 = r0.value()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    private java.util.List<java.lang.String> setupExcludes(java.lang.reflect.Field r4) {
            r3 = this;
            r0 = r4
            java.lang.Class<com.zwitserloot.cmdreader.Excludes> r1 = com.zwitserloot.cmdreader.Excludes.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.zwitserloot.cmdreader.Excludes r0 = (com.zwitserloot.cmdreader.Excludes) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L19
            r0 = r5
            java.lang.String[] r0 = r0.value()
            int r0 = r0.length
            if (r0 != 0) goto L1d
        L19:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L1d:
            r0 = r5
            java.lang.String[] r0 = r0.value()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    private boolean parseBoolean(java.lang.String r6) {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.TRUE_VALS
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        La:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2a
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            r1 = r6
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L27
            r0 = 1
            return r0
        L27:
            goto La
        L2a:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.FALSE_VALS
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L34:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L54
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            r1 = r6
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L51
            r0 = 0
            return r0
        L51:
            goto L34
        L54:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Not a boolean: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    java.lang.String getShorthand() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.shorthand
            return r0
    }

    static {
            r0 = 5
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = r0
            r2 = 0
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.Class<java.util.AbstractCollection> r3 = java.util.AbstractCollection.class
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.Class<java.util.AbstractList> r3 = java.util.AbstractList.class
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            com.zwitserloot.cmdreader.ParseItem.ARRAY_LIST_COMPATIBLES = r0
            r0 = 3
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = r0
            r2 = 0
            java.lang.Class<java.util.Set> r3 = java.util.Set.class
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.Class<java.util.AbstractSet> r3 = java.util.AbstractSet.class
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.Class<java.util.HashSet> r3 = java.util.HashSet.class
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            com.zwitserloot.cmdreader.ParseItem.HASH_SET_COMPATIBLES = r0
            r0 = 3
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = r0
            r2 = 0
            java.lang.Class<java.util.AbstractSequentialList> r3 = java.util.AbstractSequentialList.class
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.Class<java.util.Queue> r3 = java.util.Queue.class
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.Class<java.util.LinkedList> r3 = java.util.LinkedList.class
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            com.zwitserloot.cmdreader.ParseItem.LINKED_LIST_COMPATIBLES = r0
            return
    }
}
