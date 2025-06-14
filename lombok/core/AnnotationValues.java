package lombok.core;

import java.lang.annotation.Annotation;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/AnnotationValues.SCL.lombok */
public class AnnotationValues<A extends java.lang.annotation.Annotation> {
    private final java.lang.Class<A> type;
    private final java.util.Map<java.lang.String, lombok.core.AnnotationValues.AnnotationValue> values;
    private final lombok.core.LombokNode<?, ?, ?> ast;
    private A cachedInstance;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AnnotationValues$AnnotationValue.SCL.lombok */
    public static class AnnotationValue {
        public final java.util.List<java.lang.String> raws;
        public final java.util.List<java.lang.Object> valueGuesses;
        public final java.util.List<java.lang.Object> expressions;
        private final lombok.core.LombokNode<?, ?, ?> node;
        private final boolean isExplicit;

        public AnnotationValue(lombok.core.LombokNode<?, ?, ?> r4, java.util.List<java.lang.String> r5, java.util.List<java.lang.Object> r6, java.util.List<java.lang.Object> r7, boolean r8) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.node = r1
                r0 = r3
                r1 = r5
                r0.raws = r1
                r0 = r3
                r1 = r6
                r0.expressions = r1
                r0 = r3
                r1 = r7
                r0.valueGuesses = r1
                r0 = r3
                r1 = r8
                r0.isExplicit = r1
                return
        }

        public void setError(java.lang.String r4, int r5) {
                r3 = this;
                r0 = r3
                lombok.core.LombokNode<?, ?, ?> r0 = r0.node
                r1 = r4
                r0.addError(r1)
                return
        }

        public void setWarning(java.lang.String r4, int r5) {
                r3 = this;
                r0 = r3
                lombok.core.LombokNode<?, ?, ?> r0 = r0.node
                r1 = r4
                r0.addError(r1)
                return
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "raws: "
                r1.<init>(r2)
                r1 = r4
                java.util.List<java.lang.String> r1 = r1.raws
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " valueGuesses: "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                java.util.List<java.lang.Object> r1 = r1.valueGuesses
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public boolean isExplicit() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.isExplicit
                return r0
        }

        static /* synthetic */ boolean access$0(lombok.core.AnnotationValues.AnnotationValue r2) {
                r0 = r2
                boolean r0 = r0.isExplicit
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AnnotationValues$AnnotationValueDecodeFail.SCL.lombok */
    public static class AnnotationValueDecodeFail extends java.lang.RuntimeException {
        private static final long serialVersionUID = 1;
        public final int idx;
        public final lombok.core.AnnotationValues.AnnotationValue owner;

        public AnnotationValueDecodeFail(lombok.core.AnnotationValues.AnnotationValue r4, java.lang.String r5, int r6) {
                r3 = this;
                r0 = r3
                r1 = r5
                r0.<init>(r1)
                r0 = r3
                r1 = r6
                r0.idx = r1
                r0 = r3
                r1 = r4
                r0.owner = r1
                return
        }
    }

    public AnnotationValues(java.lang.Class<A> r4, java.util.Map<java.lang.String, lombok.core.AnnotationValues.AnnotationValue> r5, lombok.core.LombokNode<?, ?, ?> r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.cachedInstance = r1
            r0 = r3
            r1 = r4
            r0.type = r1
            r0 = r3
            r1 = r5
            r0.values = r1
            r0 = r3
            r1 = r6
            r0.ast = r1
            return
    }

    /* renamed from: of */
    public static <A extends java.lang.annotation.Annotation> lombok.core.AnnotationValues<A> m57of(java.lang.Class<A> r6) {
            lombok.core.AnnotationValues r0 = new lombok.core.AnnotationValues
            r1 = r0
            r2 = r6
            java.util.Map r3 = java.util.Collections.emptyMap()
            r4 = 0
            r1.<init>(r2, r3, r4)
            return r0
    }

    /* renamed from: of */
    public static <A extends java.lang.annotation.Annotation> lombok.core.AnnotationValues<A> m58of(java.lang.Class<A> r6, lombok.core.LombokNode<?, ?, ?> r7) {
            lombok.core.AnnotationValues r0 = new lombok.core.AnnotationValues
            r1 = r0
            r2 = r6
            java.util.Map r3 = java.util.Collections.emptyMap()
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
    }

    private static lombok.core.AnnotationValues.AnnotationValueDecodeFail makeNoDefaultFail(lombok.core.AnnotationValues.AnnotationValue r7, java.lang.reflect.Method r8) {
            lombok.core.AnnotationValues$AnnotationValueDecodeFail r0 = new lombok.core.AnnotationValues$AnnotationValueDecodeFail
            r1 = r0
            r2 = r7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            java.lang.String r5 = "No value supplied but "
            r4.<init>(r5)
            r4 = r8
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " has no default either."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = -1
            r1.<init>(r2, r3, r4)
            return r0
    }

    public java.util.List<java.lang.String> getAsStringList(java.lang.String r7) {
            r6 = this;
            r0 = r6
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L27
            r0 = r6
            r1 = r7
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object r0 = r0.getDefaultIf(r1, r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r9 = r0
            r0 = r9
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
        L27:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r8
            java.util.List<java.lang.Object> r2 = r2.valueGuesses
            int r2 = r2.size()
            r1.<init>(r2)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r8
            java.util.List<java.lang.Object> r0 = r0.valueGuesses
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto Laa
        L49:
            r0 = r12
            java.lang.Object r0 = r0.next()
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L5b
            r0 = 0
            goto L66
        L5b:
            r0 = r6
            r1 = r11
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = r8
            r4 = r10
            java.lang.Object r0 = r0.guessToType(r1, r2, r3, r4)
        L66:
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L9e
            r0 = r8
            java.util.List<java.lang.Object> r0 = r0.valueGuesses
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L91
            r0 = r6
            r1 = r7
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object r0 = r0.getDefaultIf(r1, r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r14 = r0
            r0 = r14
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
        L91:
            lombok.core.AnnotationValues$AnnotationValueDecodeFail r0 = new lombok.core.AnnotationValues$AnnotationValueDecodeFail
            r1 = r0
            r2 = r8
            java.lang.String r3 = "I can't make sense of this annotation value. Try using a fully qualified literal."
            r4 = r10
            r1.<init>(r2, r3, r4)
            throw r0
        L9e:
            r0 = r9
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.add(r1)
        Laa:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L49
            r0 = r9
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.lang.String getAsString(java.lang.String r7) {
            r6 = this;
            r0 = r6
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L1f
            r0 = r8
            java.util.List<java.lang.Object> r0 = r0.valueGuesses
            int r0 = r0.size()
            r1 = 1
            if (r0 == r1) goto L2a
        L1f:
            r0 = r6
            r1 = r7
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.getDefaultIf(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L2a:
            r0 = r6
            r1 = r8
            java.util.List<java.lang.Object> r1 = r1.valueGuesses
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = r8
            r4 = 0
            java.lang.Object r0 = r0.guessToType(r1, r2, r3, r4)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L49
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L49:
            r0 = r6
            r1 = r7
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.getDefaultIf(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public boolean getAsBoolean(java.lang.String r7) {
            r6 = this;
            r0 = r6
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L1f
            r0 = r8
            java.util.List<java.lang.Object> r0 = r0.valueGuesses
            int r0 = r0.size()
            r1 = 1
            if (r0 == r1) goto L2f
        L1f:
            r0 = r6
            r1 = r7
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.getDefaultIf(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L2f:
            r0 = r6
            r1 = r8
            java.util.List<java.lang.Object> r1 = r1.valueGuesses
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = r8
            r4 = 0
            java.lang.Object r0 = r0.guessToType(r1, r2, r3, r4)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L52
            r0 = r9
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L52:
            r0 = r6
            r1 = r7
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.getDefaultIf(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public <T> T getDefaultIf(java.lang.String r5, T r6) {
            r4 = this;
            r0 = r4
            java.lang.Class<A extends java.lang.annotation.Annotation> r0 = r0.type     // Catch: java.lang.Exception -> L10
            r1 = r5
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L10
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L10
            java.lang.Object r0 = r0.getDefaultValue()     // Catch: java.lang.Exception -> L10
            return r0
        L10:
            r0 = r6
            return r0
    }

    public A getInstance() {
            r7 = this;
            r0 = r7
            A extends java.lang.annotation.Annotation r0 = r0.cachedInstance
            if (r0 == 0) goto Lc
            r0 = r7
            A extends java.lang.annotation.Annotation r0 = r0.cachedInstance
            return r0
        Lc:
            lombok.core.AnnotationValues$1 r0 = new lombok.core.AnnotationValues$1
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = r7
            r1 = r7
            java.lang.Class<A extends java.lang.annotation.Annotation> r1 = r1.type
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            r5 = r7
            java.lang.Class<A extends java.lang.annotation.Annotation> r5 = r5.type
            r3[r4] = r5
            r3 = r8
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r1, r2, r3)
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            r2 = r1; r1 = r0; r0 = r2; 
            r1.cachedInstance = r2
            return r0
    }

    private java.lang.Object guessToType(java.lang.Object r8, java.lang.Class<?> r9, lombok.core.AnnotationValues.AnnotationValue r10, int r11) {
            r7 = this;
            r0 = r9
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 == r1) goto Ld
            r0 = r9
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 != r1) goto L2d
        Ld:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto L22
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 != 0) goto L22
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L2d
        L22:
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L2d:
            r0 = r9
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 == r1) goto L3a
            r0 = r9
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r0 != r1) goto L61
        L3a:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 != 0) goto L56
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto L56
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 != 0) goto L56
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L61
        L56:
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L61:
            r0 = r9
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 == r1) goto L6e
            r0 = r9
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r0 != r1) goto La2
        L6e:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto L83
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 != 0) goto L83
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto La2
        L83:
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r12 = r0
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            r13 = r0
            r0 = r13
            r1 = r12
            if (r0 != r1) goto La2
            r0 = r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        La2:
            r0 = r9
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 == r1) goto Laf
            r0 = r9
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r0 != r1) goto Le3
        Laf:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto Lc4
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 != 0) goto Lc4
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto Le3
        Lc4:
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r12 = r0
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            r13 = r0
            r0 = r13
            r1 = r12
            if (r0 != r1) goto Le3
            r0 = r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        Le3:
            r0 = r9
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 == r1) goto Lf1
            r0 = r9
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto L103
        Lf1:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L103
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L103:
            r0 = r9
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 == r1) goto L111
            r0 = r9
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto L123
        L111:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L123
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L123:
            r0 = r9
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 == r1) goto L130
            r0 = r9
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r0 != r1) goto L142
        L130:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L142
            r0 = r8
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L142:
            r0 = r9
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 == r1) goto L150
            r0 = r9
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            if (r0 != r1) goto L162
        L150:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Character
            if (r0 == 0) goto L162
            r0 = r8
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L162:
            r0 = r9
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L171
            r0 = r8
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L171
            r0 = r8
            return r0
        L171:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            r1 = r9
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L1ea
            r0 = r8
            boolean r0 = r0 instanceof lombok.core.FieldSelect
            if (r0 == 0) goto L1ea
            r0 = r8
            lombok.core.FieldSelect r0 = (lombok.core.FieldSelect) r0
            java.lang.String r0 = r0.getFinalPart()
            r12 = r0
            r0 = r9
            java.lang.Object[] r0 = r0.getEnumConstants()
            r1 = r0
            r16 = r1
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r14 = r0
            goto L1bc
        L19b:
            r0 = r16
            r1 = r14
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.lang.String r0 = r0.name()
            r17 = r0
            r0 = r17
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b9
            r0 = r13
            return r0
        L1b9:
            int r14 = r14 + 1
        L1bc:
            r0 = r14
            r1 = r15
            if (r0 < r1) goto L19b
            lombok.core.AnnotationValues$AnnotationValueDecodeFail r0 = new lombok.core.AnnotationValues$AnnotationValueDecodeFail
            r1 = r0
            r2 = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            java.lang.String r5 = "Can't translate "
            r4.<init>(r5)
            r4 = r12
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " to an enum of type "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r9
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r11
            r1.<init>(r2, r3, r4)
            throw r0
        L1ea:
            r0 = r9
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            if (r0 != r1) goto L22d
            r0 = r8
            boolean r0 = r0 instanceof lombok.core.ClassLiteral
            if (r0 == 0) goto L22d
            r0 = r8
            lombok.core.ClassLiteral r0 = (lombok.core.ClassLiteral) r0     // Catch: java.lang.ClassNotFoundException -> L20a
            java.lang.String r0 = r0.getClassName()     // Catch: java.lang.ClassNotFoundException -> L20a
            r12 = r0
            r0 = r7
            r1 = r12
            java.lang.String r0 = r0.toFQ(r1)     // Catch: java.lang.ClassNotFoundException -> L20a
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L20a
            return r0
        L20a:
            lombok.core.AnnotationValues$AnnotationValueDecodeFail r0 = new lombok.core.AnnotationValues$AnnotationValueDecodeFail
            r1 = r0
            r2 = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            java.lang.String r5 = "Can't translate "
            r4.<init>(r5)
            r4 = r8
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " to a class object."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r11
            r1.<init>(r2, r3, r4)
            throw r0
        L22d:
            r0 = r8
            boolean r0 = r0 instanceof lombok.core.AnnotationValues
            if (r0 == 0) goto L23c
            r0 = r8
            lombok.core.AnnotationValues r0 = (lombok.core.AnnotationValues) r0
            java.lang.annotation.Annotation r0 = r0.getInstance()
            return r0
        L23c:
            r0 = r8
            boolean r0 = r0 instanceof lombok.core.FieldSelect
            if (r0 == 0) goto L251
            lombok.core.AnnotationValues$AnnotationValueDecodeFail r0 = new lombok.core.AnnotationValues$AnnotationValueDecodeFail
            r1 = r0
            r2 = r10
            java.lang.String r3 = "You must use constant literals in lombok annotations; they cannot be references to (static) fields."
            r4 = r11
            r1.<init>(r2, r3, r4)
            throw r0
        L251:
            lombok.core.AnnotationValues$AnnotationValueDecodeFail r0 = new lombok.core.AnnotationValues$AnnotationValueDecodeFail
            r1 = r0
            r2 = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            java.lang.String r5 = "Can't translate a "
            r4.<init>(r5)
            r4 = r8
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " to the expected "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r9
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r11
            r1.<init>(r2, r3, r4)
            throw r0
    }

    public java.util.List<java.lang.String> getRawExpressions(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L18
            java.util.List r0 = java.util.Collections.emptyList()
            goto L1c
        L18:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.raws
        L1c:
            return r0
    }

    public java.util.List<java.lang.Object> getActualExpressions(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L18
            java.util.List r0 = java.util.Collections.emptyList()
            goto L1c
        L18:
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.expressions
        L1c:
            return r0
    }

    public boolean isExplicit(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1b
            r0 = r5
            boolean r0 = r0.isExplicit()
            if (r0 == 0) goto L1b
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public java.lang.String getRawExpression(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.util.List r0 = r0.getRawExpressions(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            r0 = 0
            goto L1d
        L13:
            r0 = r5
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
        L1d:
            return r0
    }

    public java.lang.Object getActualExpression(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.util.List r0 = r0.getActualExpressions(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            r0 = 0
            goto L1a
        L13:
            r0 = r5
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
        L1a:
            return r0
    }

    public java.lang.Object getValueGuess(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1e
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.valueGuesses
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
        L1e:
            r0 = 0
            goto L2c
        L22:
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.valueGuesses
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
        L2c:
            return r0
    }

    public void setError(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = -1
            r0.setError(r1, r2, r3)
            return
    }

    public void setWarning(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = -1
            r0.setWarning(r1, r2, r3)
            return
    }

    public void setError(java.lang.String r5, java.lang.String r6, int r7) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L15
            return
        L15:
            r0 = r8
            r1 = r6
            r2 = r7
            r0.setError(r1, r2)
            return
    }

    public void setWarning(java.lang.String r5, java.lang.String r6, int r7) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L15
            return
        L15:
            r0 = r8
            r1 = r6
            r2 = r7
            r0.setWarning(r1, r2)
            return
    }

    public java.util.List<java.lang.String> getProbableFQTypes(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L1e
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L1e:
            r0 = r7
            java.util.List<java.lang.Object> r0 = r0.valueGuesses
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L4e
        L2c:
            r0 = r9
            java.lang.Object r0 = r0.next()
            r8 = r0
            r0 = r6
            r1 = r8
            if (r1 != 0) goto L3f
            r1 = 0
            goto L48
        L3f:
            r1 = r4
            r2 = r8
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.toFQ(r2)
        L48:
            boolean r0 = r0.add(r1)
        L4e:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2c
            r0 = r6
            return r0
    }

    public java.lang.String getProbableFQType(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.util.List r0 = r0.getProbableFQTypes(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            r0 = 0
            goto L1d
        L13:
            r0 = r5
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
        L1d:
            return r0
    }

    private java.lang.String toFQ(java.lang.String r6) {
            r5 = this;
            r0 = r6
            r1 = 46
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 <= r1) goto L18
            r0 = r6
            r1 = 0
            r2 = r6
            r3 = 46
            int r2 = r2.indexOf(r3)
            java.lang.String r0 = r0.substring(r1, r2)
            goto L19
        L18:
            r0 = r6
        L19:
            r7 = r0
            r0 = r5
            lombok.core.LombokNode<?, ?, ?> r0 = r0.ast
            r8 = r0
            goto Le9
        L22:
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto Le4
            r0 = r8
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r7
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le4
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L73
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L5a
            goto L73
        L5a:
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto Led
            r0 = r10
            r1 = r8
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.add(r1)
            goto Led
        L73:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r5
            lombok.core.LombokNode<?, ?, ?> r0 = r0.ast
            java.lang.String r0 = r0.getPackageDeclaration()
            if (r0 == 0) goto L93
            r0 = r11
            r1 = r5
            lombok.core.LombokNode<?, ?, ?> r1 = r1.ast
            java.lang.String r1 = r1.getPackageDeclaration()
            java.lang.StringBuilder r0 = r0.append(r1)
        L93:
            r0 = r11
            int r0 = r0.length()
            if (r0 <= 0) goto La3
            r0 = r11
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
        La3:
            r0 = r10
            java.util.Collections.reverse(r0)
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto Lcd
        Lb4:
            r0 = r13
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r11
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
        Lcd:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb4
            r0 = r11
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r11
            java.lang.String r0 = r0.toString()
            return r0
        Le4:
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            r8 = r0
        Le9:
            r0 = r8
            if (r0 != 0) goto L22
        Led:
            r0 = r7
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L109
            r0 = r5
            lombok.core.LombokNode<?, ?, ?> r0 = r0.ast
            lombok.core.ImportList r0 = r0.getImportList()
            r1 = r6
            java.lang.String r0 = r0.getFullyQualifiedNameForSimpleName(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L109
            r0 = r8
            return r0
        L109:
            r0 = r5
            lombok.core.LombokNode<?, ?, ?> r0 = r0.ast
            lombok.core.ImportList r0 = r0.getImportList()
            java.lang.String r1 = "java"
            r2 = r6
            java.util.Collection r0 = r0.applyNameToStarImports(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L140
        L123:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13f
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L140
            r0 = r10
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L13f
            return r0
        L13f:
        L140:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L123
            r0 = r6
            r1 = 46
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 != r1) goto L15d
            r0 = r5
            lombok.core.LombokNode<?, ?, ?> r0 = r0.ast
            r1 = r6
            java.lang.String r0 = inLocalPackage(r0, r1)
            return r0
        L15d:
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            r8 = r0
            r0 = r8
            boolean r0 = java.lang.Character.isTitleCase(r0)
            if (r0 != 0) goto L171
            r0 = r8
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 == 0) goto L17a
        L171:
            r0 = r5
            lombok.core.LombokNode<?, ?, ?> r0 = r0.ast
            r1 = r6
            java.lang.String r0 = inLocalPackage(r0, r1)
            return r0
        L17a:
            r0 = r6
            return r0
    }

    private static java.lang.String inLocalPackage(lombok.core.LombokNode<?, ?, ?> r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L1c
            r0 = r3
            java.lang.String r0 = r0.getPackageDeclaration()
            if (r0 == 0) goto L1c
            r0 = r5
            r1 = r3
            java.lang.String r1 = r1.getPackageDeclaration()
            java.lang.StringBuilder r0 = r0.append(r1)
        L1c:
            r0 = r5
            int r0 = r0.length()
            if (r0 <= 0) goto L2a
            r0 = r5
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
        L2a:
            r0 = r5
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    public lombok.core.AnnotationValues<A> integrate(lombok.core.AnnotationValues<A> r5) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            r0 = r5
            return r0
        Le:
            r0 = r5
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L7c
        L20:
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r6 = r0
            r0 = r6
            java.lang.Object r0 = r0.getValue()
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            boolean r0 = lombok.core.AnnotationValues.AnnotationValue.access$0(r0)
            if (r0 != 0) goto L3c
            goto L7c
        L3c:
            r0 = r4
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r6
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L60
            r0 = r8
            boolean r0 = lombok.core.AnnotationValues.AnnotationValue.access$0(r0)
            if (r0 == 0) goto L60
            goto L7c
        L60:
            r0 = r4
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            r1 = r6
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r2 = r6
            java.lang.Object r2 = r2.getValue()
            lombok.core.AnnotationValues$AnnotationValue r2 = (lombok.core.AnnotationValues.AnnotationValue) r2
            java.lang.Object r0 = r0.put(r1, r2)
        L7c:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L20
            r0 = r4
            return r0
    }

    public boolean isMarking() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
            goto L25
        L12:
            r0 = r4
            java.lang.Object r0 = r0.next()
            lombok.core.AnnotationValues$AnnotationValue r0 = (lombok.core.AnnotationValues.AnnotationValue) r0
            r3 = r0
            r0 = r3
            boolean r0 = lombok.core.AnnotationValues.AnnotationValue.access$0(r0)
            if (r0 == 0) goto L25
            r0 = 0
            return r0
        L25:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L12
            r0 = 1
            return r0
    }

    static /* synthetic */ java.util.Map access$0(lombok.core.AnnotationValues r2) {
            r0 = r2
            java.util.Map<java.lang.String, lombok.core.AnnotationValues$AnnotationValue> r0 = r0.values
            return r0
    }

    static /* synthetic */ lombok.core.AnnotationValues.AnnotationValueDecodeFail access$1(lombok.core.AnnotationValues.AnnotationValue r3, java.lang.reflect.Method r4) {
            r0 = r3
            r1 = r4
            lombok.core.AnnotationValues$AnnotationValueDecodeFail r0 = makeNoDefaultFail(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Object access$2(lombok.core.AnnotationValues r6, java.lang.Object r7, java.lang.Class r8, lombok.core.AnnotationValues.AnnotationValue r9, int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r0 = r0.guessToType(r1, r2, r3, r4)
            return r0
    }
}
