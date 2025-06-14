package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/NullAnnotationLibrary.SCL.lombok */
public final class NullAnnotationLibrary implements lombok.core.configuration.ConfigurationValueType {
    private final java.lang.String key;
    private final java.lang.String nonNullAnnotation;
    private final java.lang.String nullableAnnotation;
    private final boolean typeUse;
    public static final lombok.core.configuration.NullAnnotationLibrary NONE = null;
    public static final lombok.core.configuration.NullAnnotationLibrary JAVAX = null;
    public static final lombok.core.configuration.NullAnnotationLibrary ECLIPSE = null;
    public static final lombok.core.configuration.NullAnnotationLibrary JETBRAINS = null;
    public static final lombok.core.configuration.NullAnnotationLibrary NETBEANS = null;
    public static final lombok.core.configuration.NullAnnotationLibrary ANDROIDX = null;
    public static final lombok.core.configuration.NullAnnotationLibrary ANDROID_SUPPORT = null;
    public static final lombok.core.configuration.NullAnnotationLibrary CHECKERFRAMEWORK = null;
    public static final lombok.core.configuration.NullAnnotationLibrary FINDBUGS = null;
    public static final lombok.core.configuration.NullAnnotationLibrary SPRING = null;
    public static final lombok.core.configuration.NullAnnotationLibrary JML = null;
    private static final java.util.List<lombok.core.configuration.NullAnnotationLibrary> ALL_AVAILABLE = null;
    private static final java.lang.String EXAMPLE_VALUE = null;
    private static final java.lang.String MSG = "Not an identifier (provide a fully qualified type for custom: nullity annotations): ";

    static {
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "none"
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.NONE = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "javax"
            java.lang.String r3 = "javax.annotation.Nonnull"
            java.lang.String r4 = "javax.annotation.Nullable"
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.JAVAX = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "eclipse"
            java.lang.String r3 = "org.eclipse.jdt.annotation.NonNull"
            java.lang.String r4 = "org.eclipse.jdt.annotation.Nullable"
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.ECLIPSE = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "jetbrains"
            java.lang.String r3 = "org.jetbrains.annotations.NotNull"
            java.lang.String r4 = "org.jetbrains.annotations.Nullable"
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.JETBRAINS = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "netbeans"
            java.lang.String r3 = "org.netbeans.api.annotations.common.NonNull"
            java.lang.String r4 = "org.netbeans.api.annotations.common.NullAllowed"
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.NETBEANS = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "androidx"
            java.lang.String r3 = "androidx.annotation.NonNull"
            java.lang.String r4 = "androidx.annotation.Nullable"
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.ANDROIDX = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "android.support"
            java.lang.String r3 = "android.support.annotation.NonNull"
            java.lang.String r4 = "android.support.annotation.Nullable"
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.ANDROID_SUPPORT = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "checkerframework"
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.NonNull"
            java.lang.String r4 = "org.checkerframework.checker.nullness.qual.Nullable"
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.CHECKERFRAMEWORK = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "findbugs"
            java.lang.String r3 = "edu.umd.cs.findbugs.annotations.NonNull"
            java.lang.String r4 = "edu.umd.cs.findbugs.annotations.Nullable"
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.FINDBUGS = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "spring"
            java.lang.String r3 = "org.springframework.lang.NonNull"
            java.lang.String r4 = "org.springframework.lang.Nullable"
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.SPRING = r0
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.String r2 = "jml"
            java.lang.String r3 = "org.jmlspecs.annotation.NonNull"
            java.lang.String r4 = "org.jmlspecs.annotation.Nullable"
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            lombok.core.configuration.NullAnnotationLibrary.JML = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            java.lang.Class<lombok.core.configuration.NullAnnotationLibrary> r0 = lombok.core.configuration.NullAnnotationLibrary.class
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L125
        Ld9:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            java.lang.Class r0 = r0.getType()
            java.lang.Class<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.core.configuration.NullAnnotationLibrary.class
            if (r0 != r1) goto L122
            r0 = r9
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L122
            r0 = r9
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 != 0) goto Lfe
            goto L122
        Lfe:
            r0 = r9
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L121
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0     // Catch: java.lang.IllegalAccessException -> L121
            r13 = r0
            r0 = r7
            r1 = r13
            boolean r0 = r0.add(r1)     // Catch: java.lang.IllegalAccessException -> L121
            r0 = r8
            r1 = r13
            java.lang.String r1 = r1.key     // Catch: java.lang.IllegalAccessException -> L121
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L121
            java.lang.String r1 = " | "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L121
            goto L122
        L121:
        L122:
            int r10 = r10 + 1
        L125:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto Ld9
            r0 = r7
            r0.trimToSize()
            r0 = r8
            java.lang.String r1 = "CUSTOM:com.foo.my.nonnull.annotation:com.foo.my.nullable.annotation"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.core.configuration.NullAnnotationLibrary.ALL_AVAILABLE = r0
            r0 = r8
            java.lang.String r0 = r0.toString()
            lombok.core.configuration.NullAnnotationLibrary.EXAMPLE_VALUE = r0
            return
    }

    private NullAnnotationLibrary(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.key = r1
            r0 = r3
            r1 = r5
            r0.nonNullAnnotation = r1
            r0 = r3
            r1 = r6
            r0.nullableAnnotation = r1
            r0 = r3
            r1 = r7
            r0.typeUse = r1
            return
    }

    public java.lang.String getNonNullAnnotation() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.nonNullAnnotation
            return r0
    }

    public java.lang.String getNullableAnnotation() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.nullableAnnotation
            return r0
    }

    public boolean isTypeUse() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.typeUse
            return r0
    }

    public static lombok.core.configuration.NullAnnotationLibrary custom(java.lang.String r7, java.lang.String r8, boolean r9) {
            r0 = r7
            if (r0 != 0) goto Lc
            r0 = r8
            if (r0 != 0) goto Lc
            lombok.core.configuration.NullAnnotationLibrary r0 = lombok.core.configuration.NullAnnotationLibrary.NONE
            return r0
        Lc:
            r0 = r9
            if (r0 == 0) goto L15
            java.lang.String r0 = "TYPE_USE:"
            goto L17
        L15:
            java.lang.String r0 = ""
        L17:
            r10 = r0
            r0 = r8
            if (r0 != 0) goto L3b
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "custom:"
            r3.<init>(r4)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r7
            r4 = 0
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            return r0
        L3b:
            r0 = r7
            if (r0 != 0) goto L5e
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "custom::"
            r3.<init>(r4)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            return r0
        L5e:
            lombok.core.configuration.NullAnnotationLibrary r0 = new lombok.core.configuration.NullAnnotationLibrary
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "custom:"
            r3.<init>(r4)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ":"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r7
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static java.lang.String description() {
            java.lang.String r0 = "nullity-annotation-library"
            return r0
    }

    public static java.lang.String exampleValue() {
            java.lang.String r0 = lombok.core.configuration.NullAnnotationLibrary.EXAMPLE_VALUE
            return r0
    }

    public static lombok.core.configuration.NullAnnotationLibrary valueOf(java.lang.String r4) {
            r0 = r4
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            r0 = r4
            java.lang.String r0 = r0.toLowerCase()
        Ld:
            r5 = r0
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L19
            lombok.core.configuration.NullAnnotationLibrary r0 = lombok.core.configuration.NullAnnotationLibrary.NONE
            return r0
        L19:
            java.util.List<lombok.core.configuration.NullAnnotationLibrary> r0 = lombok.core.configuration.NullAnnotationLibrary.ALL_AVAILABLE
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L3c
        L25:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r6 = r0
            r0 = r6
            java.lang.String r0 = r0.key
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            r0 = r6
            return r0
        L3c:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L25
            r0 = r5
            java.lang.String r1 = "custom:"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto La8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Invalid null annotation library. Valid options: "
            r1.<init>(r2)
            r6 = r0
            java.util.List<lombok.core.configuration.NullAnnotationLibrary> r0 = lombok.core.configuration.NullAnnotationLibrary.ALL_AVAILABLE
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L80
        L66:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r7 = r0
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.key
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L80:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L66
            r0 = r6
            r1 = r6
            int r1 = r1.length()
            r2 = 2
            int r1 = r1 - r2
            r0.setLength(r1)
            r0 = r6
            java.lang.String r1 = " or CUSTOM:[TYPE_USE:]nonnull.annotation.type:nullable.annotation.type"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        La8:
            r0 = r5
            java.lang.String r1 = "custom:type_use:"
            boolean r0 = r0.startsWith(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto Lb9
            r0 = 16
            goto Lbb
        Lb9:
            r0 = 7
        Lbb:
            r7 = r0
            r0 = r5
            r1 = 58
            r2 = r7
            int r0 = r0.indexOf(r1, r2)
            r8 = r0
            r0 = r8
            r1 = -1
            if (r0 != r1) goto Ldd
            r0 = r4
            r1 = r7
            java.lang.String r0 = r0.substring(r1)
            r9 = r0
            r0 = r9
            java.lang.String r0 = verifyTypeName(r0)
            r1 = 0
            r2 = r6
            lombok.core.configuration.NullAnnotationLibrary r0 = custom(r0, r1, r2)
            return r0
        Ldd:
            r0 = r4
            r1 = r7
            r2 = r8
            java.lang.String r0 = r0.substring(r1, r2)
            r9 = r0
            r0 = r4
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r10 = r0
            r0 = r9
            java.lang.String r0 = verifyTypeName(r0)
            r1 = r10
            java.lang.String r1 = verifyTypeName(r1)
            r2 = r6
            lombok.core.configuration.NullAnnotationLibrary r0 = custom(r0, r1, r2)
            return r0
    }

    private static java.lang.String verifyTypeName(java.lang.String r6) {
            r0 = 1
            r7 = r0
            r0 = 0
            r8 = r0
            goto L65
        L7:
            r0 = r6
            r1 = r8
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r0)
            if (r0 == 0) goto L19
            r0 = 0
            r7 = r0
            goto L62
        L19:
            r0 = r7
            if (r0 == 0) goto L35
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Not an identifier (provide a fully qualified type for custom: nullity annotations): "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L35:
            r0 = r9
            r1 = 46
            if (r0 != r1) goto L40
            r0 = 1
            r7 = r0
            goto L62
        L40:
            r0 = r9
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            if (r0 == 0) goto L4a
            goto L62
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Not an identifier (provide a fully qualified type for custom: nullity annotations): "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L62:
            int r8 = r8 + 1
        L65:
            r0 = r8
            r1 = r6
            int r1 = r1.length()
            if (r0 < r1) goto L7
            r0 = r7
            if (r0 == 0) goto L89
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Not an identifier (provide a fully qualified type for custom: nullity annotations): "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L89:
            r0 = r6
            return r0
    }
}
