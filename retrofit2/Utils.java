package retrofit2;

/* loaded from: classes.dex */
final class Utils {
    static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = null;

    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type componentType;

        GenericArrayTypeImpl(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                r0.componentType = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto Le
                java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
                boolean r2 = retrofit2.Utils.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.reflect.Type r1 = r2.componentType
                java.lang.String r1 = retrofit2.Utils.typeToString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "[]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {

        @javax.annotation.Nullable
        private final java.lang.reflect.Type ownerType;
        private final java.lang.reflect.Type rawType;
        private final java.lang.reflect.Type[] typeArguments;

        ParameterizedTypeImpl(@javax.annotation.Nullable java.lang.reflect.Type r5, java.lang.reflect.Type r6, java.lang.reflect.Type... r7) {
                r4 = this;
                r4.<init>()
                boolean r0 = r6 instanceof java.lang.Class
                r1 = 0
                if (r0 == 0) goto L22
                r0 = 1
                if (r5 != 0) goto Ld
                r2 = r0
                goto Le
            Ld:
                r2 = r1
            Le:
                r3 = r6
                java.lang.Class r3 = (java.lang.Class) r3
                java.lang.Class r3 = r3.getEnclosingClass()
                if (r3 != 0) goto L18
                goto L19
            L18:
                r0 = r1
            L19:
                if (r2 != r0) goto L1c
                goto L22
            L1c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r5.<init>()
                throw r5
            L22:
                int r0 = r7.length
            L23:
                if (r1 >= r0) goto L32
                r2 = r7[r1]
                java.lang.String r3 = "typeArgument == null"
                java.util.Objects.requireNonNull(r2, r3)
                retrofit2.Utils.checkNotPrimitive(r2)
                int r1 = r1 + 1
                goto L23
            L32:
                r4.ownerType = r5
                r4.rawType = r6
                java.lang.Object r5 = r7.clone()
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r4.typeArguments = r5
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto Le
                java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
                boolean r2 = retrofit2.Utils.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
                r1 = this;
                java.lang.reflect.Type[] r0 = r1.typeArguments
                java.lang.Object r0 = r0.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        @javax.annotation.Nullable
        public java.lang.reflect.Type getOwnerType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.ownerType
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.rawType
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type[] r0 = r2.typeArguments
                int r0 = java.util.Arrays.hashCode(r0)
                java.lang.reflect.Type r1 = r2.rawType
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                java.lang.reflect.Type r1 = r2.ownerType
                if (r1 == 0) goto L16
                int r1 = r1.hashCode()
                goto L17
            L16:
                r1 = 0
            L17:
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.reflect.Type[] r0 = r5.typeArguments
                int r0 = r0.length
                if (r0 != 0) goto Lc
                java.lang.reflect.Type r0 = r5.rawType
                java.lang.String r0 = retrofit2.Utils.typeToString(r0)
                return r0
            Lc:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.reflect.Type[] r1 = r5.typeArguments
                int r1 = r1.length
                r2 = 1
                int r1 = r1 + r2
                int r1 = r1 * 30
                r0.<init>(r1)
                java.lang.reflect.Type r1 = r5.rawType
                java.lang.String r1 = retrofit2.Utils.typeToString(r1)
                r0.append(r1)
                java.lang.String r1 = "<"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.reflect.Type[] r3 = r5.typeArguments
                r4 = 0
                r3 = r3[r4]
                java.lang.String r3 = retrofit2.Utils.typeToString(r3)
                r1.append(r3)
            L33:
                java.lang.reflect.Type[] r1 = r5.typeArguments
                int r1 = r1.length
                if (r2 >= r1) goto L4c
                java.lang.String r1 = ", "
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.reflect.Type[] r3 = r5.typeArguments
                r3 = r3[r2]
                java.lang.String r3 = retrofit2.Utils.typeToString(r3)
                r1.append(r3)
                int r2 = r2 + 1
                goto L33
            L4c:
                java.lang.String r1 = ">"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static final class WildcardTypeImpl implements java.lang.reflect.WildcardType {

        @javax.annotation.Nullable
        private final java.lang.reflect.Type lowerBound;
        private final java.lang.reflect.Type upperBound;

        WildcardTypeImpl(java.lang.reflect.Type[] r4, java.lang.reflect.Type[] r5) {
                r3 = this;
                r3.<init>()
                int r0 = r5.length
                r1 = 1
                if (r0 > r1) goto L41
                int r0 = r4.length
                if (r0 != r1) goto L3b
                int r0 = r5.length
                r2 = 0
                if (r0 != r1) goto L2b
                r0 = r5[r2]
                r0.getClass()
                retrofit2.Utils.checkNotPrimitive(r0)
                r4 = r4[r2]
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                if (r4 != r0) goto L25
                r4 = r5[r2]
                r3.lowerBound = r4
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                r3.upperBound = r4
                goto L3a
            L25:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r4.<init>()
                throw r4
            L2b:
                r5 = r4[r2]
                r5.getClass()
                retrofit2.Utils.checkNotPrimitive(r5)
                r5 = 0
                r3.lowerBound = r5
                r4 = r4[r2]
                r3.upperBound = r4
            L3a:
                return
            L3b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r4.<init>()
                throw r4
            L41:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r4.<init>()
                throw r4
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto Le
                java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
                boolean r2 = retrofit2.Utils.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
                r3 = this;
                java.lang.reflect.Type r0 = r3.lowerBound
                if (r0 == 0) goto Lb
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                r1[r2] = r0
                goto Ld
            Lb:
                java.lang.reflect.Type[] r1 = retrofit2.Utils.EMPTY_TYPE_ARRAY
            Ld:
                return r1
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
                r3 = this;
                r0 = 1
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                r1 = 0
                java.lang.reflect.Type r2 = r3.upperBound
                r0[r1] = r2
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.lowerBound
                if (r0 == 0) goto Lb
                int r0 = r0.hashCode()
                int r0 = r0 + 31
                goto Lc
            Lb:
                r0 = 1
            Lc:
                java.lang.reflect.Type r1 = r2.upperBound
                int r1 = r1.hashCode()
                int r1 = r1 + 31
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.lowerBound
                if (r0 == 0) goto L1a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "? super "
                r0.<init>(r1)
                java.lang.reflect.Type r1 = r2.lowerBound
                java.lang.String r1 = retrofit2.Utils.typeToString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L1a:
                java.lang.reflect.Type r0 = r2.upperBound
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                if (r0 != r1) goto L23
                java.lang.String r0 = "?"
                return r0
            L23:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "? extends "
                r0.<init>(r1)
                java.lang.reflect.Type r1 = r2.upperBound
                java.lang.String r1 = retrofit2.Utils.typeToString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            retrofit2.Utils.EMPTY_TYPE_ARRAY = r0
            return
    }

    private Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    static okhttp3.ResponseBody buffer(okhttp3.ResponseBody r4) throws java.io.IOException {
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.BufferedSource r1 = r4.source()
            r1.readAll(r0)
            okhttp3.MediaType r1 = r4.contentType()
            long r2 = r4.contentLength()
            okhttp3.ResponseBody r4 = okhttp3.ResponseBody.create(r1, r2, r0)
            return r4
    }

    static void checkNotPrimitive(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L13
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Ld
            goto L13
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L13:
            return
    }

    @javax.annotation.Nullable
    private static java.lang.Class<?> declaringClassOf(java.lang.reflect.TypeVariable<?> r1) {
            java.lang.reflect.GenericDeclaration r1 = r1.getGenericDeclaration()
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    static boolean equals(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto Ld
            boolean r4 = r4.equals(r5)
            return r4
        Ld:
            boolean r1 = r4 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            if (r1 == 0) goto L4c
            boolean r1 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r1 = r4.getOwnerType()
            java.lang.reflect.Type r3 = r5.getOwnerType()
            if (r1 == r3) goto L2d
            if (r1 == 0) goto L4a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4a
        L2d:
            java.lang.reflect.Type r1 = r4.getRawType()
            java.lang.reflect.Type r3 = r5.getRawType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4a
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L4a
            goto L4b
        L4a:
            r0 = r2
        L4b:
            return r0
        L4c:
            boolean r1 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L66
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L55
            return r2
        L55:
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r4 = equals(r4, r5)
            return r4
        L66:
            boolean r1 = r4 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L92
            boolean r1 = r5 instanceof java.lang.reflect.WildcardType
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r3 = r5.getUpperBounds()
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L90
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L90
            goto L91
        L90:
            r0 = r2
        L91:
            return r0
        L92:
            boolean r1 = r4 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto Lba
            boolean r1 = r5 instanceof java.lang.reflect.TypeVariable
            if (r1 != 0) goto L9b
            return r2
        L9b:
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.GenericDeclaration r1 = r4.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r5.getGenericDeclaration()
            if (r1 != r3) goto Lb8
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lb8
            goto Lb9
        Lb8:
            r0 = r2
        Lb9:
            return r0
        Lba:
            return r2
    }

    static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            if (r5 != r4) goto L3
            return r3
        L3:
            boolean r3 = r5.isInterface()
            if (r3 == 0) goto L32
            java.lang.Class[] r3 = r4.getInterfaces()
            int r0 = r3.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L32
            r2 = r3[r1]
            if (r2 != r5) goto L1c
            java.lang.reflect.Type[] r3 = r4.getGenericInterfaces()
            r3 = r3[r1]
            return r3
        L1c:
            boolean r2 = r5.isAssignableFrom(r2)
            if (r2 == 0) goto L2f
            java.lang.reflect.Type[] r4 = r4.getGenericInterfaces()
            r4 = r4[r1]
            r3 = r3[r1]
            java.lang.reflect.Type r3 = getGenericSupertype(r4, r3, r5)
            return r3
        L2f:
            int r1 = r1 + 1
            goto Lf
        L32:
            boolean r3 = r4.isInterface()
            if (r3 != 0) goto L58
        L38:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r4 == r3) goto L58
            java.lang.Class r3 = r4.getSuperclass()
            if (r3 != r5) goto L47
            java.lang.reflect.Type r3 = r4.getGenericSuperclass()
            return r3
        L47:
            boolean r0 = r5.isAssignableFrom(r3)
            if (r0 == 0) goto L56
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.Type r3 = getGenericSupertype(r4, r3, r5)
            return r3
        L56:
            r4 = r3
            goto L38
        L58:
            return r5
    }

    static java.lang.reflect.Type getParameterLowerBound(int r0, java.lang.reflect.ParameterizedType r1) {
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r0 = r1[r0]
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L13
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getLowerBounds()
            r1 = 0
            r0 = r0[r1]
        L13:
            return r0
    }

    static java.lang.reflect.Type getParameterUpperBound(int r4, java.lang.reflect.ParameterizedType r5) {
            java.lang.reflect.Type[] r0 = r5.getActualTypeArguments()
            if (r4 < 0) goto L19
            int r1 = r0.length
            if (r4 >= r1) goto L19
            r4 = r0[r4]
            boolean r5 = r4 instanceof java.lang.reflect.WildcardType
            if (r5 == 0) goto L18
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getUpperBounds()
            r5 = 0
            r4 = r4[r5]
        L18:
            return r4
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Index "
            r2.<init>(r3)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r2 = " not in range [0,"
            java.lang.StringBuilder r4 = r4.append(r2)
            int r0 = r0.length
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = ") for "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
    }

    static java.lang.Class<?> getRawType(java.lang.reflect.Type r3) {
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto Lc
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        Lc:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L23
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1d
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L23:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L3b
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            java.lang.Class r3 = getRawType(r3)
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r1)
            java.lang.Class r3 = r3.getClass()
            return r3
        L3b:
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L42
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            return r3
        L42:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L53
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r3 = r3.getUpperBounds()
            r3 = r3[r1]
            java.lang.Class r3 = getRawType(r3)
            return r3
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "> is of type "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    static java.lang.reflect.Type getSupertype(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.Class<?> r3) {
            boolean r0 = r3.isAssignableFrom(r2)
            if (r0 == 0) goto Lf
            java.lang.reflect.Type r3 = getGenericSupertype(r1, r2, r3)
            java.lang.reflect.Type r1 = resolve(r1, r2, r3)
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    static boolean hasUnresolvableType(@javax.annotation.Nullable java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.Class
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L22
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            int r0 = r5.length
            r3 = r1
        L13:
            if (r3 >= r0) goto L21
            r4 = r5[r3]
            boolean r4 = hasUnresolvableType(r4)
            if (r4 == 0) goto L1e
            return r2
        L1e:
            int r3 = r3 + 1
            goto L13
        L21:
            return r1
        L22:
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L31
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r5 = hasUnresolvableType(r5)
            return r5
        L31:
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L36
            return r2
        L36:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L3b
            return r2
        L3b:
            if (r5 != 0) goto L40
            java.lang.String r0 = "null"
            goto L48
        L40:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
        L48:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = "> is of type "
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
    }

    private static int indexOf(java.lang.Object[] r2, java.lang.Object r3) {
            r0 = 0
        L1:
            int r1 = r2.length
            if (r0 >= r1) goto L10
            r1 = r2[r0]
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            int r0 = r0 + 1
            goto L1
        L10:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    static boolean isAnnotationPresent(java.lang.annotation.Annotation[] r4, java.lang.Class<? extends java.lang.annotation.Annotation> r5) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L12
            r3 = r4[r2]
            boolean r3 = r5.isInstance(r3)
            if (r3 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    static java.lang.RuntimeException methodError(java.lang.reflect.Method r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 0
            java.lang.RuntimeException r1 = methodError(r1, r0, r2, r3)
            return r1
    }

    static java.lang.RuntimeException methodError(java.lang.reflect.Method r1, @javax.annotation.Nullable java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\n    for method "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.Class r0 = r1.getDeclaringClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r4.<init>(r1, r2)
            return r4
    }

    static java.lang.RuntimeException parameterError(java.lang.reflect.Method r1, int r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " (parameter #"
            java.lang.StringBuilder r3 = r3.append(r0)
            int r2 = r2 + 1
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.RuntimeException r1 = methodError(r1, r2, r4)
            return r1
    }

    static java.lang.RuntimeException parameterError(java.lang.reflect.Method r1, java.lang.Throwable r2, int r3, java.lang.String r4, java.lang.Object... r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " (parameter #"
            java.lang.StringBuilder r4 = r4.append(r0)
            int r3 = r3 + 1
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = ")"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.RuntimeException r1 = methodError(r1, r2, r3, r5)
            return r1
    }

    static java.lang.reflect.Type resolve(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto Lf
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = resolveTypeVariable(r8, r9, r10)
            if (r0 != r10) goto Ld
            return r0
        Ld:
            r10 = r0
            goto L0
        Lf:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L2d
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L2d
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = resolve(r8, r9, r10)
            if (r10 != r8) goto L27
            goto L2c
        L27:
            retrofit2.Utils$GenericArrayTypeImpl r0 = new retrofit2.Utils$GenericArrayTypeImpl
            r0.<init>(r8)
        L2c:
            return r0
        L2d:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L44
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = resolve(r8, r9, r0)
            if (r0 != r8) goto L3e
            goto L43
        L3e:
            retrofit2.Utils$GenericArrayTypeImpl r10 = new retrofit2.Utils$GenericArrayTypeImpl
            r10.<init>(r8)
        L43:
            return r10
        L44:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L86
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = resolve(r8, r9, r0)
            if (r3 == r0) goto L58
            r0 = r1
            goto L59
        L58:
            r0 = r2
        L59:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L5e:
            if (r2 >= r5) goto L79
            r6 = r4[r2]
            java.lang.reflect.Type r6 = resolve(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L76
            if (r0 != 0) goto L74
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L74:
            r4[r2] = r6
        L76:
            int r2 = r2 + 1
            goto L5e
        L79:
            if (r0 == 0) goto L85
            retrofit2.Utils$ParameterizedTypeImpl r8 = new retrofit2.Utils$ParameterizedTypeImpl
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L85:
            return r10
        L86:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lca
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto Lb1
            r3 = r0[r2]
            java.lang.reflect.Type r8 = resolve(r8, r9, r3)
            r9 = r0[r2]
            if (r8 == r9) goto Lca
            retrofit2.Utils$WildcardTypeImpl r9 = new retrofit2.Utils$WildcardTypeImpl
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r2] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            r0[r2] = r8
            r9.<init>(r10, r0)
            return r9
        Lb1:
            int r0 = r3.length
            if (r0 != r1) goto Lca
            r0 = r3[r2]
            java.lang.reflect.Type r8 = resolve(r8, r9, r0)
            r9 = r3[r2]
            if (r8 == r9) goto Lca
            retrofit2.Utils$WildcardTypeImpl r9 = new retrofit2.Utils$WildcardTypeImpl
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r2] = r8
            java.lang.reflect.Type[] r8 = retrofit2.Utils.EMPTY_TYPE_ARRAY
            r9.<init>(r10, r8)
            return r9
        Lca:
            return r10
    }

    private static java.lang.reflect.Type resolveTypeVariable(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.TypeVariable<?> r3) {
            java.lang.Class r0 = declaringClassOf(r3)
            if (r0 != 0) goto L7
            return r3
        L7:
            java.lang.reflect.Type r1 = getGenericSupertype(r1, r2, r0)
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L20
            java.lang.reflect.TypeVariable[] r2 = r0.getTypeParameters()
            int r2 = indexOf(r2, r3)
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r1 = r1[r2]
            return r1
        L20:
            return r3
    }

    static void throwIfFatal(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.lang.VirtualMachineError
            if (r0 != 0) goto L13
            boolean r0 = r1 instanceof java.lang.ThreadDeath
            if (r0 != 0) goto L10
            boolean r0 = r1 instanceof java.lang.LinkageError
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.LinkageError r1 = (java.lang.LinkageError) r1
            throw r1
        L10:
            java.lang.ThreadDeath r1 = (java.lang.ThreadDeath) r1
            throw r1
        L13:
            java.lang.VirtualMachineError r1 = (java.lang.VirtualMachineError) r1
            throw r1
    }

    static java.lang.String typeToString(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            goto Lf
        Lb:
            java.lang.String r1 = r1.toString()
        Lf:
            return r1
    }
}
