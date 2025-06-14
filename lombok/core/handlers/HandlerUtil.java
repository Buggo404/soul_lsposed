package lombok.core.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/handlers/HandlerUtil.SCL.lombok */
public class HandlerUtil {
    public static final java.util.List<java.lang.String> NONNULL_ANNOTATIONS = null;
    public static final java.util.List<java.lang.String> BASE_COPYABLE_ANNOTATIONS = null;
    public static final java.util.List<java.lang.String> COPY_TO_SETTER_ANNOTATIONS = null;
    public static final java.util.List<java.lang.String> COPY_TO_BUILDER_SINGULAR_SETTER_ANNOTATIONS = null;
    public static final java.util.List<java.lang.String> JACKSON_COPY_TO_BUILDER_ANNOTATIONS = null;
    public static final java.util.List<java.lang.String> INVALID_ON_BUILDERS = null;
    public static final java.lang.String DEFAULT_EXCEPTION_FOR_NON_NULL = "java.lang.NullPointerException";
    private static final java.util.regex.Pattern PRIMITIVE_WRAPPER_TYPE_NAME_PATTERN = null;
    private static final java.util.regex.Pattern SECTION_FINDER = null;
    private static final java.util.regex.Pattern LINE_BREAK_FINDER = null;
    private static final java.util.regex.Pattern FIND_RETURN = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/handlers/HandlerUtil$FieldAccess.SCL.lombok */
    public enum FieldAccess extends java.lang.Enum<lombok.core.handlers.HandlerUtil.FieldAccess> {
        public static final lombok.core.handlers.HandlerUtil.FieldAccess GETTER = null;
        public static final lombok.core.handlers.HandlerUtil.FieldAccess PREFER_FIELD = null;
        public static final lombok.core.handlers.HandlerUtil.FieldAccess ALWAYS_FIELD = null;
        private static final /* synthetic */ lombok.core.handlers.HandlerUtil.FieldAccess[] ENUM$VALUES = null;

        static {
                lombok.core.handlers.HandlerUtil$FieldAccess r0 = new lombok.core.handlers.HandlerUtil$FieldAccess
                r1 = r0
                java.lang.String r2 = "GETTER"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.core.handlers.HandlerUtil.FieldAccess.GETTER = r0
                lombok.core.handlers.HandlerUtil$FieldAccess r0 = new lombok.core.handlers.HandlerUtil$FieldAccess
                r1 = r0
                java.lang.String r2 = "PREFER_FIELD"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.core.handlers.HandlerUtil.FieldAccess.PREFER_FIELD = r0
                lombok.core.handlers.HandlerUtil$FieldAccess r0 = new lombok.core.handlers.HandlerUtil$FieldAccess
                r1 = r0
                java.lang.String r2 = "ALWAYS_FIELD"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD = r0
                r0 = 3
                lombok.core.handlers.HandlerUtil$FieldAccess[] r0 = new lombok.core.handlers.HandlerUtil.FieldAccess[r0]
                r1 = r0
                r2 = 0
                lombok.core.handlers.HandlerUtil$FieldAccess r3 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.core.handlers.HandlerUtil$FieldAccess r3 = lombok.core.handlers.HandlerUtil.FieldAccess.PREFER_FIELD
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.core.handlers.HandlerUtil$FieldAccess r3 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
                r1[r2] = r3
                lombok.core.handlers.HandlerUtil.FieldAccess.ENUM$VALUES = r0
                return
        }

        FieldAccess(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public static lombok.core.handlers.HandlerUtil.FieldAccess[] values() {
                lombok.core.handlers.HandlerUtil$FieldAccess[] r0 = lombok.core.handlers.HandlerUtil.FieldAccess.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.core.handlers.HandlerUtil$FieldAccess[] r2 = new lombok.core.handlers.HandlerUtil.FieldAccess[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.core.handlers.HandlerUtil.FieldAccess valueOf(java.lang.String r3) {
                java.lang.Class<lombok.core.handlers.HandlerUtil$FieldAccess> r0 = lombok.core.handlers.HandlerUtil.FieldAccess.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.core.handlers.HandlerUtil$FieldAccess r0 = (lombok.core.handlers.HandlerUtil.FieldAccess) r0
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/handlers/HandlerUtil$JavadocTag.SCL.lombok */
    public enum JavadocTag extends java.lang.Enum<lombok.core.handlers.HandlerUtil.JavadocTag> {
        public static final lombok.core.handlers.HandlerUtil.JavadocTag PARAM = null;
        public static final lombok.core.handlers.HandlerUtil.JavadocTag RETURN = null;
        private java.util.regex.Pattern pattern;
        private static final /* synthetic */ lombok.core.handlers.HandlerUtil.JavadocTag[] ENUM$VALUES = null;

        static {
                lombok.core.handlers.HandlerUtil$JavadocTag r0 = new lombok.core.handlers.HandlerUtil$JavadocTag
                r1 = r0
                java.lang.String r2 = "PARAM"
                r3 = 0
                java.lang.String r4 = "@param(?:eter)?"
                r1.<init>(r2, r3, r4)
                lombok.core.handlers.HandlerUtil.JavadocTag.PARAM = r0
                lombok.core.handlers.HandlerUtil$JavadocTag r0 = new lombok.core.handlers.HandlerUtil$JavadocTag
                r1 = r0
                java.lang.String r2 = "RETURN"
                r3 = 1
                java.lang.String r4 = "@returns?"
                r1.<init>(r2, r3, r4)
                lombok.core.handlers.HandlerUtil.JavadocTag.RETURN = r0
                r0 = 2
                lombok.core.handlers.HandlerUtil$JavadocTag[] r0 = new lombok.core.handlers.HandlerUtil.JavadocTag[r0]
                r1 = r0
                r2 = 0
                lombok.core.handlers.HandlerUtil$JavadocTag r3 = lombok.core.handlers.HandlerUtil.JavadocTag.PARAM
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.core.handlers.HandlerUtil$JavadocTag r3 = lombok.core.handlers.HandlerUtil.JavadocTag.RETURN
                r1[r2] = r3
                lombok.core.handlers.HandlerUtil.JavadocTag.ENUM$VALUES = r0
                return
        }

        JavadocTag(java.lang.String r6, int r7, java.lang.String r8) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r0.<init>(r1, r2)
                r0 = r5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                java.lang.String r3 = "\\s?^[ \\t]*\\**[ \\t]*"
                r2.<init>(r3)
                r2 = r8
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "(\\S|\\s)*?(?=(\\s^\\s*\\**\\s*@|\\Z))"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 10
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
                r0.pattern = r1
                return
        }

        public static lombok.core.handlers.HandlerUtil.JavadocTag[] values() {
                lombok.core.handlers.HandlerUtil$JavadocTag[] r0 = lombok.core.handlers.HandlerUtil.JavadocTag.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.core.handlers.HandlerUtil$JavadocTag[] r2 = new lombok.core.handlers.HandlerUtil.JavadocTag[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.core.handlers.HandlerUtil.JavadocTag valueOf(java.lang.String r3) {
                java.lang.Class<lombok.core.handlers.HandlerUtil$JavadocTag> r0 = lombok.core.handlers.HandlerUtil.JavadocTag.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.core.handlers.HandlerUtil$JavadocTag r0 = (lombok.core.handlers.HandlerUtil.JavadocTag) r0
                return r0
        }

        static /* synthetic */ java.util.regex.Pattern access$2(lombok.core.handlers.HandlerUtil.JavadocTag r2) {
                r0 = r2
                java.util.regex.Pattern r0 = r0.pattern
                return r0
        }
    }

    static {
            r0 = 27
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "android.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "android.support.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "android.support.annotation.RecentlyNonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "androidx.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "androidx.annotation.RecentlyNonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "com.android.annotations.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "com.google.firebase.database.annotations.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "com.mongodb.lang.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.String r3 = "com.sun.istack.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 9
            java.lang.String r3 = "com.unboundid.util.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 10
            java.lang.String r3 = "edu.umd.cs.findbugs.annotations.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 11
            java.lang.String r3 = "io.micrometer.core.lang.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 12
            java.lang.String r3 = "io.reactivex.annotations.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 13
            java.lang.String r3 = "io.reactivex.rxjava3.annotations.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 14
            java.lang.String r3 = "javax.annotation.Nonnull"
            r1[r2] = r3
            r1 = r0
            r2 = 15
            java.lang.String r3 = "libcore.util.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 16
            java.lang.String r3 = "lombok.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 17
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 18
            java.lang.String r3 = "org.checkerframework.checker.nullness.compatqual.NonNullDecl"
            r1[r2] = r3
            r1 = r0
            r2 = 19
            java.lang.String r3 = "org.checkerframework.checker.nullness.compatqual.NonNullType"
            r1[r2] = r3
            r1 = r0
            r2 = 20
            java.lang.String r3 = "org.codehaus.commons.nullanalysis.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 21
            java.lang.String r3 = "org.eclipse.jdt.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 22
            java.lang.String r3 = "org.jetbrains.annotations.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 23
            java.lang.String r3 = "org.jmlspecs.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 24
            java.lang.String r3 = "org.netbeans.api.annotations.common.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 25
            java.lang.String r3 = "org.springframework.lang.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 26
            java.lang.String r3 = "reactor.util.annotation.NonNull"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.core.handlers.HandlerUtil.NONNULL_ANNOTATIONS = r0
            r0 = 285(0x11d, float:4.0E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "android.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "android.annotation.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "android.support.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "android.support.annotation.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "android.support.annotation.RecentlyNonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "android.support.annotation.RecentlyNullable"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "androidx.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "androidx.annotation.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.String r3 = "androidx.annotation.RecentlyNonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 9
            java.lang.String r3 = "androidx.annotation.RecentlyNullable"
            r1[r2] = r3
            r1 = r0
            r2 = 10
            java.lang.String r3 = "com.android.annotations.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 11
            java.lang.String r3 = "com.android.annotations.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 12
            java.lang.String r3 = "com.google.firebase.database.annotations.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 13
            java.lang.String r3 = "com.google.firebase.database.annotations.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 14
            java.lang.String r3 = "com.mongodb.lang.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 15
            java.lang.String r3 = "com.mongodb.lang.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 16
            java.lang.String r3 = "com.sun.istack.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 17
            java.lang.String r3 = "com.sun.istack.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 18
            java.lang.String r3 = "com.unboundid.util.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 19
            java.lang.String r3 = "com.unboundid.util.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 20
            java.lang.String r3 = "edu.umd.cs.findbugs.annotations.CheckForNull"
            r1[r2] = r3
            r1 = r0
            r2 = 21
            java.lang.String r3 = "edu.umd.cs.findbugs.annotations.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 22
            java.lang.String r3 = "edu.umd.cs.findbugs.annotations.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 23
            java.lang.String r3 = "edu.umd.cs.findbugs.annotations.PossiblyNull"
            r1[r2] = r3
            r1 = r0
            r2 = 24
            java.lang.String r3 = "edu.umd.cs.findbugs.annotations.UnknownNullness"
            r1[r2] = r3
            r1 = r0
            r2 = 25
            java.lang.String r3 = "io.micrometer.core.lang.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 26
            java.lang.String r3 = "io.micrometer.core.lang.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 27
            java.lang.String r3 = "io.reactivex.annotations.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 28
            java.lang.String r3 = "io.reactivex.annotations.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 29
            java.lang.String r3 = "io.reactivex.rxjava3.annotations.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 30
            java.lang.String r3 = "io.reactivex.rxjava3.annotations.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 31
            java.lang.String r3 = "javax.annotation.CheckForNull"
            r1[r2] = r3
            r1 = r0
            r2 = 32
            java.lang.String r3 = "javax.annotation.Nonnull"
            r1[r2] = r3
            r1 = r0
            r2 = 33
            java.lang.String r3 = "javax.annotation.Nonnull"
            r1[r2] = r3
            r1 = r0
            r2 = 34
            java.lang.String r3 = "javax.annotation.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 35
            java.lang.String r3 = "libcore.util.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 36
            java.lang.String r3 = "libcore.util.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 37
            java.lang.String r3 = "lombok.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 38
            java.lang.String r3 = "org.checkerframework.checker.nullness.compatqual.NonNullDecl"
            r1[r2] = r3
            r1 = r0
            r2 = 39
            java.lang.String r3 = "org.checkerframework.checker.nullness.compatqual.NonNullType"
            r1[r2] = r3
            r1 = r0
            r2 = 40
            java.lang.String r3 = "org.checkerframework.checker.nullness.compatqual.NullableDecl"
            r1[r2] = r3
            r1 = r0
            r2 = 41
            java.lang.String r3 = "org.checkerframework.checker.nullness.compatqual.NullableType"
            r1[r2] = r3
            r1 = r0
            r2 = 42
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 43
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 44
            java.lang.String r3 = "org.codehaus.commons.nullanalysis.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 45
            java.lang.String r3 = "org.codehaus.commons.nullanalysis.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 46
            java.lang.String r3 = "org.eclipse.jdt.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 47
            java.lang.String r3 = "org.eclipse.jdt.annotation.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 48
            java.lang.String r3 = "org.jetbrains.annotations.NotNull"
            r1[r2] = r3
            r1 = r0
            r2 = 49
            java.lang.String r3 = "org.jetbrains.annotations.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 50
            java.lang.String r3 = "org.jetbrains.annotations.UnknownNullability"
            r1[r2] = r3
            r1 = r0
            r2 = 51
            java.lang.String r3 = "org.jmlspecs.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 52
            java.lang.String r3 = "org.jmlspecs.annotation.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 53
            java.lang.String r3 = "org.jspecify.nullness.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 54
            java.lang.String r3 = "org.jspecify.nullness.NullnessUnspecified"
            r1[r2] = r3
            r1 = r0
            r2 = 55
            java.lang.String r3 = "org.netbeans.api.annotations.common.CheckForNull"
            r1[r2] = r3
            r1 = r0
            r2 = 56
            java.lang.String r3 = "org.netbeans.api.annotations.common.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 57
            java.lang.String r3 = "org.netbeans.api.annotations.common.NullAllowed"
            r1[r2] = r3
            r1 = r0
            r2 = 58
            java.lang.String r3 = "org.netbeans.api.annotations.common.NullUnknown"
            r1[r2] = r3
            r1 = r0
            r2 = 59
            java.lang.String r3 = "org.springframework.lang.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 60
            java.lang.String r3 = "org.springframework.lang.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 61
            java.lang.String r3 = "reactor.util.annotation.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 62
            java.lang.String r3 = "reactor.util.annotation.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 63
            java.lang.String r3 = "org.checkerframework.checker.builder.qual.CalledMethods"
            r1[r2] = r3
            r1 = r0
            r2 = 64
            java.lang.String r3 = "org.checkerframework.checker.builder.qual.NotCalledMethods"
            r1[r2] = r3
            r1 = r0
            r2 = 65
            java.lang.String r3 = "org.checkerframework.checker.calledmethods.qual.CalledMethods"
            r1[r2] = r3
            r1 = r0
            r2 = 66
            java.lang.String r3 = "org.checkerframework.checker.calledmethods.qual.CalledMethodsBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 67
            java.lang.String r3 = "org.checkerframework.checker.calledmethods.qual.CalledMethodsPredicate"
            r1[r2] = r3
            r1 = r0
            r2 = 68
            java.lang.String r3 = "org.checkerframework.checker.compilermsgs.qual.CompilerMessageKey"
            r1[r2] = r3
            r1 = r0
            r2 = 69
            java.lang.String r3 = "org.checkerframework.checker.compilermsgs.qual.CompilerMessageKeyBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 70
            java.lang.String r3 = "org.checkerframework.checker.compilermsgs.qual.UnknownCompilerMessageKey"
            r1[r2] = r3
            r1 = r0
            r2 = 71
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.AwtAlphaCompositingRule"
            r1[r2] = r3
            r1 = r0
            r2 = 72
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.AwtColorSpace"
            r1[r2] = r3
            r1 = r0
            r2 = 73
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.AwtCursorType"
            r1[r2] = r3
            r1 = r0
            r2 = 74
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.AwtFlowLayout"
            r1[r2] = r3
            r1 = r0
            r2 = 75
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.Fenum"
            r1[r2] = r3
            r1 = r0
            r2 = 76
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.FenumBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 77
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.FenumTop"
            r1[r2] = r3
            r1 = r0
            r2 = 78
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.PolyFenum"
            r1[r2] = r3
            r1 = r0
            r2 = 79
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.SwingBoxOrientation"
            r1[r2] = r3
            r1 = r0
            r2 = 80
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.SwingCompassDirection"
            r1[r2] = r3
            r1 = r0
            r2 = 81
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.SwingElementOrientation"
            r1[r2] = r3
            r1 = r0
            r2 = 82
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.SwingHorizontalOrientation"
            r1[r2] = r3
            r1 = r0
            r2 = 83
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.SwingSplitPaneOrientation"
            r1[r2] = r3
            r1 = r0
            r2 = 84
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.SwingTextOrientation"
            r1[r2] = r3
            r1 = r0
            r2 = 85
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.SwingTitleJustification"
            r1[r2] = r3
            r1 = r0
            r2 = 86
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.SwingTitlePosition"
            r1[r2] = r3
            r1 = r0
            r2 = 87
            java.lang.String r3 = "org.checkerframework.checker.fenum.qual.SwingVerticalOrientation"
            r1[r2] = r3
            r1 = r0
            r2 = 88
            java.lang.String r3 = "org.checkerframework.checker.formatter.qual.Format"
            r1[r2] = r3
            r1 = r0
            r2 = 89
            java.lang.String r3 = "org.checkerframework.checker.formatter.qual.FormatBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 90
            java.lang.String r3 = "org.checkerframework.checker.formatter.qual.InvalidFormat"
            r1[r2] = r3
            r1 = r0
            r2 = 91
            java.lang.String r3 = "org.checkerframework.checker.formatter.qual.UnknownFormat"
            r1[r2] = r3
            r1 = r0
            r2 = 92
            java.lang.String r3 = "org.checkerframework.checker.guieffect.qual.AlwaysSafe"
            r1[r2] = r3
            r1 = r0
            r2 = 93
            java.lang.String r3 = "org.checkerframework.checker.guieffect.qual.PolyUI"
            r1[r2] = r3
            r1 = r0
            r2 = 94
            java.lang.String r3 = "org.checkerframework.checker.guieffect.qual.UI"
            r1[r2] = r3
            r1 = r0
            r2 = 95
            java.lang.String r3 = "org.checkerframework.checker.i18nformatter.qual.I18nFormat"
            r1[r2] = r3
            r1 = r0
            r2 = 96
            java.lang.String r3 = "org.checkerframework.checker.i18nformatter.qual.I18nFormatBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 97
            java.lang.String r3 = "org.checkerframework.checker.i18nformatter.qual.I18nFormatFor"
            r1[r2] = r3
            r1 = r0
            r2 = 98
            java.lang.String r3 = "org.checkerframework.checker.i18nformatter.qual.I18nInvalidFormat"
            r1[r2] = r3
            r1 = r0
            r2 = 99
            java.lang.String r3 = "org.checkerframework.checker.i18nformatter.qual.I18nUnknownFormat"
            r1[r2] = r3
            r1 = r0
            r2 = 100
            java.lang.String r3 = "org.checkerframework.checker.i18n.qual.LocalizableKey"
            r1[r2] = r3
            r1 = r0
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r3 = "org.checkerframework.checker.i18n.qual.LocalizableKeyBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 102(0x66, float:1.43E-43)
            java.lang.String r3 = "org.checkerframework.checker.i18n.qual.Localized"
            r1[r2] = r3
            r1 = r0
            r2 = 103(0x67, float:1.44E-43)
            java.lang.String r3 = "org.checkerframework.checker.i18n.qual.UnknownLocalizableKey"
            r1[r2] = r3
            r1 = r0
            r2 = 104(0x68, float:1.46E-43)
            java.lang.String r3 = "org.checkerframework.checker.i18n.qual.UnknownLocalized"
            r1[r2] = r3
            r1 = r0
            r2 = 105(0x69, float:1.47E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.GTENegativeOne"
            r1[r2] = r3
            r1 = r0
            r2 = 106(0x6a, float:1.49E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.IndexFor"
            r1[r2] = r3
            r1 = r0
            r2 = 107(0x6b, float:1.5E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.IndexOrHigh"
            r1[r2] = r3
            r1 = r0
            r2 = 108(0x6c, float:1.51E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.IndexOrLow"
            r1[r2] = r3
            r1 = r0
            r2 = 109(0x6d, float:1.53E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.LengthOf"
            r1[r2] = r3
            r1 = r0
            r2 = 110(0x6e, float:1.54E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.LessThan"
            r1[r2] = r3
            r1 = r0
            r2 = 111(0x6f, float:1.56E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.LessThanBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 112(0x70, float:1.57E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.LessThanUnknown"
            r1[r2] = r3
            r1 = r0
            r2 = 113(0x71, float:1.58E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.LowerBoundBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 114(0x72, float:1.6E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.LowerBoundUnknown"
            r1[r2] = r3
            r1 = r0
            r2 = 115(0x73, float:1.61E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.LTEqLengthOf"
            r1[r2] = r3
            r1 = r0
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.LTLengthOf"
            r1[r2] = r3
            r1 = r0
            r2 = 117(0x75, float:1.64E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.LTOMLengthOf"
            r1[r2] = r3
            r1 = r0
            r2 = 118(0x76, float:1.65E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.NegativeIndexFor"
            r1[r2] = r3
            r1 = r0
            r2 = 119(0x77, float:1.67E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.NonNegative"
            r1[r2] = r3
            r1 = r0
            r2 = 120(0x78, float:1.68E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.PolyIndex"
            r1[r2] = r3
            r1 = r0
            r2 = 121(0x79, float:1.7E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.PolyLength"
            r1[r2] = r3
            r1 = r0
            r2 = 122(0x7a, float:1.71E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.PolyLowerBound"
            r1[r2] = r3
            r1 = r0
            r2 = 123(0x7b, float:1.72E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.PolySameLen"
            r1[r2] = r3
            r1 = r0
            r2 = 124(0x7c, float:1.74E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.PolyUpperBound"
            r1[r2] = r3
            r1 = r0
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.Positive"
            r1[r2] = r3
            r1 = r0
            r2 = 126(0x7e, float:1.77E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.SameLen"
            r1[r2] = r3
            r1 = r0
            r2 = 127(0x7f, float:1.78E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.SameLenBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 128(0x80, float:1.794E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.SameLenUnknown"
            r1[r2] = r3
            r1 = r0
            r2 = 129(0x81, float:1.81E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.SearchIndexBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 130(0x82, float:1.82E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.SearchIndexFor"
            r1[r2] = r3
            r1 = r0
            r2 = 131(0x83, float:1.84E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.SearchIndexUnknown"
            r1[r2] = r3
            r1 = r0
            r2 = 132(0x84, float:1.85E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.SubstringIndexBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 133(0x85, float:1.86E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.SubstringIndexFor"
            r1[r2] = r3
            r1 = r0
            r2 = 134(0x86, float:1.88E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.SubstringIndexUnknown"
            r1[r2] = r3
            r1 = r0
            r2 = 135(0x87, float:1.89E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.UpperBoundBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 136(0x88, float:1.9E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.UpperBoundLiteral"
            r1[r2] = r3
            r1 = r0
            r2 = 137(0x89, float:1.92E-43)
            java.lang.String r3 = "org.checkerframework.checker.index.qual.UpperBoundUnknown"
            r1[r2] = r3
            r1 = r0
            r2 = 138(0x8a, float:1.93E-43)
            java.lang.String r3 = "org.checkerframework.checker.initialization.qual.FBCBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 139(0x8b, float:1.95E-43)
            java.lang.String r3 = "org.checkerframework.checker.initialization.qual.Initialized"
            r1[r2] = r3
            r1 = r0
            r2 = 140(0x8c, float:1.96E-43)
            java.lang.String r3 = "org.checkerframework.checker.initialization.qual.UnderInitialization"
            r1[r2] = r3
            r1 = r0
            r2 = 141(0x8d, float:1.98E-43)
            java.lang.String r3 = "org.checkerframework.checker.initialization.qual.UnknownInitialization"
            r1[r2] = r3
            r1 = r0
            r2 = 142(0x8e, float:1.99E-43)
            java.lang.String r3 = "org.checkerframework.checker.interning.qual.Interned"
            r1[r2] = r3
            r1 = r0
            r2 = 143(0x8f, float:2.0E-43)
            java.lang.String r3 = "org.checkerframework.checker.interning.qual.InternedDistinct"
            r1[r2] = r3
            r1 = r0
            r2 = 144(0x90, float:2.02E-43)
            java.lang.String r3 = "org.checkerframework.checker.interning.qual.PolyInterned"
            r1[r2] = r3
            r1 = r0
            r2 = 145(0x91, float:2.03E-43)
            java.lang.String r3 = "org.checkerframework.checker.interning.qual.UnknownInterned"
            r1[r2] = r3
            r1 = r0
            r2 = 146(0x92, float:2.05E-43)
            java.lang.String r3 = "org.checkerframework.checker.lock.qual.GuardedBy"
            r1[r2] = r3
            r1 = r0
            r2 = 147(0x93, float:2.06E-43)
            java.lang.String r3 = "org.checkerframework.checker.lock.qual.GuardedByBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 148(0x94, float:2.07E-43)
            java.lang.String r3 = "org.checkerframework.checker.lock.qual.GuardedByUnknown"
            r1[r2] = r3
            r1 = r0
            r2 = 149(0x95, float:2.09E-43)
            java.lang.String r3 = "org.checkerframework.checker.lock.qual.GuardSatisfied"
            r1[r2] = r3
            r1 = r0
            r2 = 150(0x96, float:2.1E-43)
            java.lang.String r3 = "org.checkerframework.checker.lock.qual.NewObject"
            r1[r2] = r3
            r1 = r0
            r2 = 151(0x97, float:2.12E-43)
            java.lang.String r3 = "org.checkerframework.checker.mustcall.qual.MustCall"
            r1[r2] = r3
            r1 = r0
            r2 = 152(0x98, float:2.13E-43)
            java.lang.String r3 = "org.checkerframework.checker.mustcall.qual.MustCallAlias"
            r1[r2] = r3
            r1 = r0
            r2 = 153(0x99, float:2.14E-43)
            java.lang.String r3 = "org.checkerframework.checker.mustcall.qual.MustCallUnknown"
            r1[r2] = r3
            r1 = r0
            r2 = 154(0x9a, float:2.16E-43)
            java.lang.String r3 = "org.checkerframework.checker.mustcall.qual.PolyMustCall"
            r1[r2] = r3
            r1 = r0
            r2 = 155(0x9b, float:2.17E-43)
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.KeyFor"
            r1[r2] = r3
            r1 = r0
            r2 = 156(0x9c, float:2.19E-43)
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.KeyForBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 157(0x9d, float:2.2E-43)
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.MonotonicNonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 158(0x9e, float:2.21E-43)
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.NonNull"
            r1[r2] = r3
            r1 = r0
            r2 = 159(0x9f, float:2.23E-43)
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.Nullable"
            r1[r2] = r3
            r1 = r0
            r2 = 160(0xa0, float:2.24E-43)
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.PolyKeyFor"
            r1[r2] = r3
            r1 = r0
            r2 = 161(0xa1, float:2.26E-43)
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.PolyNull"
            r1[r2] = r3
            r1 = r0
            r2 = 162(0xa2, float:2.27E-43)
            java.lang.String r3 = "org.checkerframework.checker.nullness.qual.UnknownKeyFor"
            r1[r2] = r3
            r1 = r0
            r2 = 163(0xa3, float:2.28E-43)
            java.lang.String r3 = "org.checkerframework.checker.optional.qual.MaybePresent"
            r1[r2] = r3
            r1 = r0
            r2 = 164(0xa4, float:2.3E-43)
            java.lang.String r3 = "org.checkerframework.checker.optional.qual.OptionalBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 165(0xa5, float:2.31E-43)
            java.lang.String r3 = "org.checkerframework.checker.optional.qual.PolyPresent"
            r1[r2] = r3
            r1 = r0
            r2 = 166(0xa6, float:2.33E-43)
            java.lang.String r3 = "org.checkerframework.checker.optional.qual.Present"
            r1[r2] = r3
            r1 = r0
            r2 = 167(0xa7, float:2.34E-43)
            java.lang.String r3 = "org.checkerframework.checker.propkey.qual.PropertyKey"
            r1[r2] = r3
            r1 = r0
            r2 = 168(0xa8, float:2.35E-43)
            java.lang.String r3 = "org.checkerframework.checker.propkey.qual.PropertyKeyBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 169(0xa9, float:2.37E-43)
            java.lang.String r3 = "org.checkerframework.checker.propkey.qual.UnknownPropertyKey"
            r1[r2] = r3
            r1 = r0
            r2 = 170(0xaa, float:2.38E-43)
            java.lang.String r3 = "org.checkerframework.checker.regex.qual.PolyRegex"
            r1[r2] = r3
            r1 = r0
            r2 = 171(0xab, float:2.4E-43)
            java.lang.String r3 = "org.checkerframework.checker.regex.qual.Regex"
            r1[r2] = r3
            r1 = r0
            r2 = 172(0xac, float:2.41E-43)
            java.lang.String r3 = "org.checkerframework.checker.regex.qual.RegexBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 173(0xad, float:2.42E-43)
            java.lang.String r3 = "org.checkerframework.checker.regex.qual.UnknownRegex"
            r1[r2] = r3
            r1 = r0
            r2 = 174(0xae, float:2.44E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.ArrayWithoutPackage"
            r1[r2] = r3
            r1 = r0
            r2 = 175(0xaf, float:2.45E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.BinaryName"
            r1[r2] = r3
            r1 = r0
            r2 = 176(0xb0, float:2.47E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.BinaryNameOrPrimitiveType"
            r1[r2] = r3
            r1 = r0
            r2 = 177(0xb1, float:2.48E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.BinaryNameWithoutPackage"
            r1[r2] = r3
            r1 = r0
            r2 = 178(0xb2, float:2.5E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.CanonicalName"
            r1[r2] = r3
            r1 = r0
            r2 = 179(0xb3, float:2.51E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.CanonicalNameAndBinaryName"
            r1[r2] = r3
            r1 = r0
            r2 = 180(0xb4, float:2.52E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.CanonicalNameOrEmpty"
            r1[r2] = r3
            r1 = r0
            r2 = 181(0xb5, float:2.54E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.CanonicalNameOrPrimitiveType"
            r1[r2] = r3
            r1 = r0
            r2 = 182(0xb6, float:2.55E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.ClassGetName"
            r1[r2] = r3
            r1 = r0
            r2 = 183(0xb7, float:2.56E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.ClassGetSimpleName"
            r1[r2] = r3
            r1 = r0
            r2 = 184(0xb8, float:2.58E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.DotSeparatedIdentifiers"
            r1[r2] = r3
            r1 = r0
            r2 = 185(0xb9, float:2.59E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.DotSeparatedIdentifiersOrPrimitiveType"
            r1[r2] = r3
            r1 = r0
            r2 = 186(0xba, float:2.6E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.FieldDescriptor"
            r1[r2] = r3
            r1 = r0
            r2 = 187(0xbb, float:2.62E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.FieldDescriptorForPrimitive"
            r1[r2] = r3
            r1 = r0
            r2 = 188(0xbc, float:2.63E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.FieldDescriptorWithoutPackage"
            r1[r2] = r3
            r1 = r0
            r2 = 189(0xbd, float:2.65E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.FqBinaryName"
            r1[r2] = r3
            r1 = r0
            r2 = 190(0xbe, float:2.66E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.FullyQualifiedName"
            r1[r2] = r3
            r1 = r0
            r2 = 191(0xbf, float:2.68E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.Identifier"
            r1[r2] = r3
            r1 = r0
            r2 = 192(0xc0, float:2.69E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.IdentifierOrPrimitiveType"
            r1[r2] = r3
            r1 = r0
            r2 = 193(0xc1, float:2.7E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.InternalForm"
            r1[r2] = r3
            r1 = r0
            r2 = 194(0xc2, float:2.72E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.MethodDescriptor"
            r1[r2] = r3
            r1 = r0
            r2 = 195(0xc3, float:2.73E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.PolySignature"
            r1[r2] = r3
            r1 = r0
            r2 = 196(0xc4, float:2.75E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.PrimitiveType"
            r1[r2] = r3
            r1 = r0
            r2 = 197(0xc5, float:2.76E-43)
            java.lang.String r3 = "org.checkerframework.checker.signature.qual.SignatureBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 198(0xc6, float:2.77E-43)
            java.lang.String r3 = "org.checkerframework.checker.signedness.qual.PolySigned"
            r1[r2] = r3
            r1 = r0
            r2 = 199(0xc7, float:2.79E-43)
            java.lang.String r3 = "org.checkerframework.checker.signedness.qual.Signed"
            r1[r2] = r3
            r1 = r0
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.String r3 = "org.checkerframework.checker.signedness.qual.SignednessBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 201(0xc9, float:2.82E-43)
            java.lang.String r3 = "org.checkerframework.checker.signedness.qual.SignednessGlb"
            r1[r2] = r3
            r1 = r0
            r2 = 202(0xca, float:2.83E-43)
            java.lang.String r3 = "org.checkerframework.checker.signedness.qual.SignedPositive"
            r1[r2] = r3
            r1 = r0
            r2 = 203(0xcb, float:2.84E-43)
            java.lang.String r3 = "org.checkerframework.checker.signedness.qual.SignedPositiveFromUnsigned"
            r1[r2] = r3
            r1 = r0
            r2 = 204(0xcc, float:2.86E-43)
            java.lang.String r3 = "org.checkerframework.checker.signedness.qual.UnknownSignedness"
            r1[r2] = r3
            r1 = r0
            r2 = 205(0xcd, float:2.87E-43)
            java.lang.String r3 = "org.checkerframework.checker.signedness.qual.Unsigned"
            r1[r2] = r3
            r1 = r0
            r2 = 206(0xce, float:2.89E-43)
            java.lang.String r3 = "org.checkerframework.checker.tainting.qual.PolyTainted"
            r1[r2] = r3
            r1 = r0
            r2 = 207(0xcf, float:2.9E-43)
            java.lang.String r3 = "org.checkerframework.checker.tainting.qual.Tainted"
            r1[r2] = r3
            r1 = r0
            r2 = 208(0xd0, float:2.91E-43)
            java.lang.String r3 = "org.checkerframework.checker.tainting.qual.Untainted"
            r1[r2] = r3
            r1 = r0
            r2 = 209(0xd1, float:2.93E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.A"
            r1[r2] = r3
            r1 = r0
            r2 = 210(0xd2, float:2.94E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Acceleration"
            r1[r2] = r3
            r1 = r0
            r2 = 211(0xd3, float:2.96E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Angle"
            r1[r2] = r3
            r1 = r0
            r2 = 212(0xd4, float:2.97E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Area"
            r1[r2] = r3
            r1 = r0
            r2 = 213(0xd5, float:2.98E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.C"
            r1[r2] = r3
            r1 = r0
            r2 = 214(0xd6, float:3.0E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.cd"
            r1[r2] = r3
            r1 = r0
            r2 = 215(0xd7, float:3.01E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Current"
            r1[r2] = r3
            r1 = r0
            r2 = 216(0xd8, float:3.03E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.degrees"
            r1[r2] = r3
            r1 = r0
            r2 = 217(0xd9, float:3.04E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Force"
            r1[r2] = r3
            r1 = r0
            r2 = 218(0xda, float:3.05E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.g"
            r1[r2] = r3
            r1 = r0
            r2 = 219(0xdb, float:3.07E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.h"
            r1[r2] = r3
            r1 = r0
            r2 = 220(0xdc, float:3.08E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.K"
            r1[r2] = r3
            r1 = r0
            r2 = 221(0xdd, float:3.1E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.kg"
            r1[r2] = r3
            r1 = r0
            r2 = 222(0xde, float:3.11E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.km"
            r1[r2] = r3
            r1 = r0
            r2 = 223(0xdf, float:3.12E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.km2"
            r1[r2] = r3
            r1 = r0
            r2 = 224(0xe0, float:3.14E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.km3"
            r1[r2] = r3
            r1 = r0
            r2 = 225(0xe1, float:3.15E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.kmPERh"
            r1[r2] = r3
            r1 = r0
            r2 = 226(0xe2, float:3.17E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.kN"
            r1[r2] = r3
            r1 = r0
            r2 = 227(0xe3, float:3.18E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Length"
            r1[r2] = r3
            r1 = r0
            r2 = 228(0xe4, float:3.2E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Luminance"
            r1[r2] = r3
            r1 = r0
            r2 = 229(0xe5, float:3.21E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.m"
            r1[r2] = r3
            r1 = r0
            r2 = 230(0xe6, float:3.22E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.m2"
            r1[r2] = r3
            r1 = r0
            r2 = 231(0xe7, float:3.24E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.m3"
            r1[r2] = r3
            r1 = r0
            r2 = 232(0xe8, float:3.25E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Mass"
            r1[r2] = r3
            r1 = r0
            r2 = 233(0xe9, float:3.27E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.min"
            r1[r2] = r3
            r1 = r0
            r2 = 234(0xea, float:3.28E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.mm"
            r1[r2] = r3
            r1 = r0
            r2 = 235(0xeb, float:3.3E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.mm2"
            r1[r2] = r3
            r1 = r0
            r2 = 236(0xec, float:3.31E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.mm3"
            r1[r2] = r3
            r1 = r0
            r2 = 237(0xed, float:3.32E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.mol"
            r1[r2] = r3
            r1 = r0
            r2 = 238(0xee, float:3.34E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.mPERs"
            r1[r2] = r3
            r1 = r0
            r2 = 239(0xef, float:3.35E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.mPERs2"
            r1[r2] = r3
            r1 = r0
            r2 = 240(0xf0, float:3.36E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.N"
            r1[r2] = r3
            r1 = r0
            r2 = 241(0xf1, float:3.38E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.PolyUnit"
            r1[r2] = r3
            r1 = r0
            r2 = 242(0xf2, float:3.39E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.radians"
            r1[r2] = r3
            r1 = r0
            r2 = 243(0xf3, float:3.4E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.s"
            r1[r2] = r3
            r1 = r0
            r2 = 244(0xf4, float:3.42E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Speed"
            r1[r2] = r3
            r1 = r0
            r2 = 245(0xf5, float:3.43E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Substance"
            r1[r2] = r3
            r1 = r0
            r2 = 246(0xf6, float:3.45E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.t"
            r1[r2] = r3
            r1 = r0
            r2 = 247(0xf7, float:3.46E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Temperature"
            r1[r2] = r3
            r1 = r0
            r2 = 248(0xf8, float:3.48E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Time"
            r1[r2] = r3
            r1 = r0
            r2 = 249(0xf9, float:3.49E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.UnitsBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 250(0xfa, float:3.5E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.UnknownUnits"
            r1[r2] = r3
            r1 = r0
            r2 = 251(0xfb, float:3.52E-43)
            java.lang.String r3 = "org.checkerframework.checker.units.qual.Volume"
            r1[r2] = r3
            r1 = r0
            r2 = 252(0xfc, float:3.53E-43)
            java.lang.String r3 = "org.checkerframework.common.aliasing.qual.LeakedToResult"
            r1[r2] = r3
            r1 = r0
            r2 = 253(0xfd, float:3.55E-43)
            java.lang.String r3 = "org.checkerframework.common.aliasing.qual.MaybeAliased"
            r1[r2] = r3
            r1 = r0
            r2 = 254(0xfe, float:3.56E-43)
            java.lang.String r3 = "org.checkerframework.common.aliasing.qual.NonLeaked"
            r1[r2] = r3
            r1 = r0
            r2 = 255(0xff, float:3.57E-43)
            java.lang.String r3 = "org.checkerframework.common.aliasing.qual.Unique"
            r1[r2] = r3
            r1 = r0
            r2 = 256(0x100, float:3.59E-43)
            java.lang.String r3 = "org.checkerframework.common.initializedfields.qual.InitializedFields"
            r1[r2] = r3
            r1 = r0
            r2 = 257(0x101, float:3.6E-43)
            java.lang.String r3 = "org.checkerframework.common.initializedfields.qual.InitializedFieldsBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 258(0x102, float:3.62E-43)
            java.lang.String r3 = "org.checkerframework.common.initializedfields.qual.PolyInitializedFields"
            r1[r2] = r3
            r1 = r0
            r2 = 259(0x103, float:3.63E-43)
            java.lang.String r3 = "org.checkerframework.common.reflection.qual.ClassBound"
            r1[r2] = r3
            r1 = r0
            r2 = 260(0x104, float:3.64E-43)
            java.lang.String r3 = "org.checkerframework.common.reflection.qual.ClassVal"
            r1[r2] = r3
            r1 = r0
            r2 = 261(0x105, float:3.66E-43)
            java.lang.String r3 = "org.checkerframework.common.reflection.qual.ClassValBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 262(0x106, float:3.67E-43)
            java.lang.String r3 = "org.checkerframework.common.reflection.qual.MethodVal"
            r1[r2] = r3
            r1 = r0
            r2 = 263(0x107, float:3.69E-43)
            java.lang.String r3 = "org.checkerframework.common.reflection.qual.MethodValBottom"
            r1[r2] = r3
            r1 = r0
            r2 = 264(0x108, float:3.7E-43)
            java.lang.String r3 = "org.checkerframework.common.reflection.qual.UnknownClass"
            r1[r2] = r3
            r1 = r0
            r2 = 265(0x109, float:3.71E-43)
            java.lang.String r3 = "org.checkerframework.common.reflection.qual.UnknownMethod"
            r1[r2] = r3
            r1 = r0
            r2 = 266(0x10a, float:3.73E-43)
            java.lang.String r3 = "org.checkerframework.common.returnsreceiver.qual.BottomThis"
            r1[r2] = r3
            r1 = r0
            r2 = 267(0x10b, float:3.74E-43)
            java.lang.String r3 = "org.checkerframework.common.returnsreceiver.qual.This"
            r1[r2] = r3
            r1 = r0
            r2 = 268(0x10c, float:3.76E-43)
            java.lang.String r3 = "org.checkerframework.common.returnsreceiver.qual.UnknownThis"
            r1[r2] = r3
            r1 = r0
            r2 = 269(0x10d, float:3.77E-43)
            java.lang.String r3 = "org.checkerframework.common.subtyping.qual.Bottom"
            r1[r2] = r3
            r1 = r0
            r2 = 270(0x10e, float:3.78E-43)
            java.lang.String r3 = "org.checkerframework.common.util.report.qual.ReportUnqualified"
            r1[r2] = r3
            r1 = r0
            r2 = 271(0x10f, float:3.8E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.ArrayLen"
            r1[r2] = r3
            r1 = r0
            r2 = 272(0x110, float:3.81E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.ArrayLenRange"
            r1[r2] = r3
            r1 = r0
            r2 = 273(0x111, float:3.83E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.BoolVal"
            r1[r2] = r3
            r1 = r0
            r2 = 274(0x112, float:3.84E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.BottomVal"
            r1[r2] = r3
            r1 = r0
            r2 = 275(0x113, float:3.85E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.DoubleVal"
            r1[r2] = r3
            r1 = r0
            r2 = 276(0x114, float:3.87E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.EnumVal"
            r1[r2] = r3
            r1 = r0
            r2 = 277(0x115, float:3.88E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.IntRange"
            r1[r2] = r3
            r1 = r0
            r2 = 278(0x116, float:3.9E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.IntVal"
            r1[r2] = r3
            r1 = r0
            r2 = 279(0x117, float:3.91E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.MatchesRegex"
            r1[r2] = r3
            r1 = r0
            r2 = 280(0x118, float:3.92E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.MinLen"
            r1[r2] = r3
            r1 = r0
            r2 = 281(0x119, float:3.94E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.PolyValue"
            r1[r2] = r3
            r1 = r0
            r2 = 282(0x11a, float:3.95E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.StringVal"
            r1[r2] = r3
            r1 = r0
            r2 = 283(0x11b, float:3.97E-43)
            java.lang.String r3 = "org.checkerframework.common.value.qual.UnknownVal"
            r1[r2] = r3
            r1 = r0
            r2 = 284(0x11c, float:3.98E-43)
            java.lang.String r3 = "org.checkerframework.framework.qual.PurityUnqualified"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.core.handlers.HandlerUtil.BASE_COPYABLE_ANNOTATIONS = r0
            r0 = 15
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JacksonInject"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonAlias"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonFormat"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonIgnore"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonIgnoreProperties"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonProperty"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonSetter"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonSubTypes"
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonTypeInfo"
            r1[r2] = r3
            r1 = r0
            r2 = 9
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonUnwrapped"
            r1[r2] = r3
            r1 = r0
            r2 = 10
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonView"
            r1[r2] = r3
            r1 = r0
            r2 = 11
            java.lang.String r3 = "com.fasterxml.jackson.databind.annotation.JsonDeserialize"
            r1[r2] = r3
            r1 = r0
            r2 = 12
            java.lang.String r3 = "com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper"
            r1[r2] = r3
            r1 = r0
            r2 = 13
            java.lang.String r3 = "com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty"
            r1[r2] = r3
            r1 = r0
            r2 = 14
            java.lang.String r3 = "com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.core.handlers.HandlerUtil.COPY_TO_SETTER_ANNOTATIONS = r0
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonAnySetter"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.core.handlers.HandlerUtil.COPY_TO_BUILDER_SINGULAR_SETTER_ANNOTATIONS = r0
            r0 = 11
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonAutoDetect"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonFormat"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonIgnoreProperties"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonIgnoreType"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonPropertyOrder"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonRootName"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonSubTypes"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonTypeInfo"
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonTypeName"
            r1[r2] = r3
            r1 = r0
            r2 = 9
            java.lang.String r3 = "com.fasterxml.jackson.annotation.JsonView"
            r1[r2] = r3
            r1 = r0
            r2 = 10
            java.lang.String r3 = "com.fasterxml.jackson.databind.annotation.JsonNaming"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.core.handlers.HandlerUtil.JACKSON_COPY_TO_BUILDER_ANNOTATIONS = r0
            r0 = 13
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.Class<lombok.Getter> r3 = lombok.Getter.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.Class<lombok.Setter> r3 = lombok.Setter.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.Class<lombok.With> r3 = lombok.With.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "lombok.experimental.Wither"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.Class<lombok.ToString> r3 = lombok.ToString.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.Class<lombok.EqualsAndHashCode> r3 = lombok.EqualsAndHashCode.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.Class<lombok.RequiredArgsConstructor> r3 = lombok.RequiredArgsConstructor.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.Class<lombok.AllArgsConstructor> r3 = lombok.AllArgsConstructor.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.Class<lombok.NoArgsConstructor> r3 = lombok.NoArgsConstructor.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 9
            java.lang.Class<lombok.Data> r3 = lombok.Data.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 10
            java.lang.Class<lombok.Value> r3 = lombok.Value.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r1 = r0
            r2 = 11
            java.lang.String r3 = "lombok.experimental.Value"
            r1[r2] = r3
            r1 = r0
            r2 = 12
            java.lang.Class<lombok.experimental.FieldDefaults> r3 = lombok.experimental.FieldDefaults.class
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.core.handlers.HandlerUtil.INVALID_ON_BUILDERS = r0
            java.lang.String r0 = "^(?:java\\.lang\\.)?(?:Boolean|Byte|Short|Integer|Long|Float|Double|Character)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.core.handlers.HandlerUtil.PRIMITIVE_WRAPPER_TYPE_NAME_PATTERN = r0
            java.lang.String r0 = "^\\s*\\**\\s*[-*][-*]+\\s*([GS]ETTER|WITH(?:ER)?)\\s*[-*][-*]+\\s*\\**\\s*$"
            r1 = 10
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            lombok.core.handlers.HandlerUtil.SECTION_FINDER = r0
            java.lang.String r0 = "(\\r?\\n)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.core.handlers.HandlerUtil.LINE_BREAK_FINDER = r0
            java.lang.String r0 = "^\\s*\\**\\s*@returns?\\s+.*$"
            r1 = 10
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            lombok.core.handlers.HandlerUtil.FIND_RETURN = r0
            return
    }

    private HandlerUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int primeForHashcode() {
            r0 = 59
            return r0
    }

    public static int primeForTrue() {
            r0 = 79
            return r0
    }

    public static int primeForFalse() {
            r0 = 97
            return r0
    }

    public static int primeForNull() {
            r0 = 43
            return r0
    }

    public static boolean checkName(java.lang.String r5, java.lang.String r6, lombok.core.LombokNode<?, ?, ?> r7) {
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r5
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " cannot be the empty string."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = 0
            return r0
        L21:
            r0 = r6
            boolean r0 = lombok.core.JavaIdentifiers.isValidJavaIdentifier(r0)
            if (r0 != 0) goto L42
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r5
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " must be a valid java identifier."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = 0
            return r0
        L42:
            r0 = 1
            return r0
    }

    public static java.lang.String autoSingularize(java.lang.String r2) {
            r0 = r2
            java.lang.String r0 = lombok.core.handlers.Singulars.autoSingularize(r0)
            return r0
    }

    public static void handleFlagUsage(lombok.core.LombokNode<?, ?, ?> r5, lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r6, java.lang.String r7) {
            r0 = r5
            lombok.core.AST r0 = r0.getAst()
            r1 = r6
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.FlagUsageType r0 = (lombok.core.configuration.FlagUsageType) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L4b
            r0 = r6
            boolean r0 = lombok.core.configuration.AllowHelper.isAllowable(r0)
            if (r0 == 0) goto L4b
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Use of "
            r2.<init>(r3)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is disabled by default. Please add '"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = r2.getKeyName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " = "
            java.lang.StringBuilder r1 = r1.append(r2)
            lombok.core.configuration.FlagUsageType r2 = lombok.core.configuration.FlagUsageType.ALLOW
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' to 'lombok.config' if you want to enable is."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
        L4b:
            r0 = r8
            if (r0 == 0) goto L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Use of "
            r1.<init>(r2)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " is flagged according to lombok configuration."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
            r0 = r8
            lombok.core.configuration.FlagUsageType r1 = lombok.core.configuration.FlagUsageType.WARNING
            if (r0 != r1) goto L78
            r0 = r5
            r1 = r9
            r0.addWarning(r1)
            goto L85
        L78:
            r0 = r8
            lombok.core.configuration.FlagUsageType r1 = lombok.core.configuration.FlagUsageType.ERROR
            if (r0 != r1) goto L85
            r0 = r5
            r1 = r9
            r0.addError(r1)
        L85:
            return
    }

    public static boolean shouldAddGenerated(lombok.core.LombokNode<?, ?, ?> r4) {
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.ADD_JAVAX_GENERATED_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r5
            boolean r0 = r0.booleanValue()
            return r0
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r4
            lombok.core.AST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ADD_GENERATED_ANNOTATIONS
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static void handleExperimentalFlagUsage(lombok.core.LombokNode<?, ?, ?> r6, lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r7, java.lang.String r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.EXPERIMENTAL_FLAG_USAGE
            java.lang.String r4 = "any lombok.experimental feature"
            handleFlagUsage(r0, r1, r2, r3, r4)
            return
    }

    public static void handleFlagUsage(lombok.core.LombokNode<?, ?, ?> r4, lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r5, java.lang.String r6, lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r7, java.lang.String r8) {
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            r1 = r5
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.FlagUsageType r0 = (lombok.core.configuration.FlagUsageType) r0
            r9 = r0
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            r1 = r7
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.FlagUsageType r0 = (lombok.core.configuration.FlagUsageType) r0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r9
            lombok.core.configuration.FlagUsageType r1 = lombok.core.configuration.FlagUsageType.ERROR
            if (r0 != r1) goto L32
            r0 = r9
            r11 = r0
            r0 = r6
            r12 = r0
            goto L5f
        L32:
            r0 = r10
            lombok.core.configuration.FlagUsageType r1 = lombok.core.configuration.FlagUsageType.ERROR
            if (r0 != r1) goto L45
            r0 = r10
            r11 = r0
            r0 = r8
            r12 = r0
            goto L5f
        L45:
            r0 = r9
            lombok.core.configuration.FlagUsageType r1 = lombok.core.configuration.FlagUsageType.WARNING
            if (r0 != r1) goto L57
            r0 = r9
            r11 = r0
            r0 = r6
            r12 = r0
            goto L5f
        L57:
            r0 = r10
            r11 = r0
            r0 = r8
            r12 = r0
        L5f:
            r0 = r11
            if (r0 == 0) goto L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Use of "
            r1.<init>(r2)
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " is flagged according to lombok configuration."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13 = r0
            r0 = r11
            lombok.core.configuration.FlagUsageType r1 = lombok.core.configuration.FlagUsageType.WARNING
            if (r0 != r1) goto L8f
            r0 = r4
            r1 = r13
            r0.addWarning(r1)
            goto L9d
        L8f:
            r0 = r11
            lombok.core.configuration.FlagUsageType r1 = lombok.core.configuration.FlagUsageType.ERROR
            if (r0 != r1) goto L9d
            r0 = r4
            r1 = r13
            r0.addError(r1)
        L9d:
            return
    }

    public static boolean shouldReturnThis0(lombok.core.AnnotationValues<lombok.experimental.Accessors> r3, lombok.core.AST<?, ?, ?> r4) {
            r0 = r3
            java.lang.String r1 = "chain"
            boolean r0 = r0.isExplicit(r1)
            r5 = r0
            r0 = r3
            java.lang.String r1 = "fluent"
            boolean r0 = r0.isExplicit(r1)
            r6 = r0
            r0 = r3
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.Accessors r0 = (lombok.experimental.Accessors) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0.chain()
            r8 = r0
            r0 = r7
            boolean r0 = r0.fluent()
            r9 = r0
            r0 = r5
            if (r0 == 0) goto L32
            r0 = r8
            return r0
        L32:
            r0 = r5
            if (r0 != 0) goto L4d
            r0 = r4
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.ACCESSORS_CHAIN
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L4d
            r0 = r10
            boolean r0 = r0.booleanValue()
            return r0
        L4d:
            r0 = r6
            if (r0 != 0) goto L69
            r0 = r4
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.ACCESSORS_FLUENT
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L69
            r0 = r10
            boolean r0 = r0.booleanValue()
            r9 = r0
        L69:
            r0 = r8
            if (r0 != 0) goto L75
            r0 = r9
            if (r0 != 0) goto L75
            r0 = 0
            return r0
        L75:
            r0 = 1
            return r0
    }

    public static boolean shouldMakeFinal0(lombok.core.AnnotationValues<lombok.experimental.Accessors> r3, lombok.core.AST<?, ?, ?> r4) {
            r0 = r3
            java.lang.String r1 = "makeFinal"
            boolean r0 = r0.isExplicit(r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L14
            r0 = r3
            java.lang.String r1 = "makeFinal"
            boolean r0 = r0.getAsBoolean(r1)
            return r0
        L14:
            r0 = r4
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.ACCESSORS_MAKE_FINAL
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L28
            r0 = r6
            boolean r0 = r0.booleanValue()
            return r0
        L28:
            r0 = 0
            return r0
    }

    public static java.lang.CharSequence removePrefix(java.lang.CharSequence r5, java.util.List<java.lang.String> r6) {
            r0 = r6
            if (r0 == 0) goto Ld
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
        Ld:
            r0 = r5
            return r0
        Lf:
            r0 = r5
            java.lang.String r0 = r0.toString()
            r5 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto Lb8
        L20:
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r7
            int r0 = r0.length()
            if (r0 != 0) goto L33
            r0 = r5
            return r0
        L33:
            r0 = r5
            int r0 = r0.length()
            r1 = r7
            int r1 = r1.length()
            if (r0 > r1) goto L43
            goto Lb8
        L43:
            r0 = 0
            r9 = r0
            goto L60
        L49:
            r0 = r5
            r1 = r9
            char r0 = r0.charAt(r1)
            r1 = r7
            r2 = r9
            char r1 = r1.charAt(r2)
            if (r0 == r1) goto L5d
            goto Lb8
        L5d:
            int r9 = r9 + 1
        L60:
            r0 = r9
            r1 = r7
            int r1 = r1.length()
            if (r0 < r1) goto L49
            r0 = r5
            r1 = r7
            int r1 = r1.length()
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r7
            r1 = r7
            int r1 = r1.length()
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isLetter(r0)
            if (r0 == 0) goto L90
            r0 = r9
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto L90
            goto Lb8
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r9
            char r1 = java.lang.Character.toLowerCase(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = r7
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            r3 = r5
            int r3 = r3.length()
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Lb8:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L20
            r0 = 0
            return r0
    }

    public static java.lang.String toGetterName(lombok.core.AST<?, ?, ?> r8, lombok.core.AnnotationValues<lombok.experimental.Accessors> r9, java.lang.CharSequence r10, boolean r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.String r4 = "is"
            java.lang.String r5 = "get"
            r6 = 1
            java.lang.String r0 = toAccessorName(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static java.lang.String toSetterName(lombok.core.AST<?, ?, ?> r8, lombok.core.AnnotationValues<lombok.experimental.Accessors> r9, java.lang.CharSequence r10, boolean r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.String r4 = "set"
            java.lang.String r5 = "set"
            r6 = 1
            java.lang.String r0 = toAccessorName(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static java.lang.String toWithName(lombok.core.AST<?, ?, ?> r8, lombok.core.AnnotationValues<lombok.experimental.Accessors> r9, java.lang.CharSequence r10, boolean r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.String r4 = "with"
            java.lang.String r5 = "with"
            r6 = 0
            java.lang.String r0 = toAccessorName(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static java.lang.String toWithByName(lombok.core.AST<?, ?, ?> r10, lombok.core.AnnotationValues<lombok.experimental.Accessors> r11, java.lang.CharSequence r12, boolean r13) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.String r6 = "with"
            java.lang.String r7 = "with"
            r8 = 0
            java.lang.String r2 = toAccessorName(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "By"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String toAccessorName(lombok.core.AST<?, ?, ?> r4, lombok.core.AnnotationValues<lombok.experimental.Accessors> r5, java.lang.CharSequence r6, boolean r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r0 = r6
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            int r0 = r0.length()
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r4
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.GETTER_CONSEQUENT_BOOLEAN
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            r0 = 0
            r7 = r0
        L24:
            r0 = r5
            if (r0 == 0) goto L36
            r0 = r5
            java.lang.String r1 = "prefix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            r11 = r0
            r0 = r5
            if (r0 == 0) goto L4b
            r0 = r5
            java.lang.String r1 = "fluent"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto L4b
            r0 = 1
            goto L4c
        L4b:
            r0 = 0
        L4c:
            r12 = r0
            r0 = r5
            if (r0 == 0) goto L60
            r0 = r5
            java.lang.String r1 = "javaBeansSpecCapitalization"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto L60
            r0 = 1
            goto L61
        L60:
            r0 = 0
        L61:
            r13 = r0
            r0 = r11
            if (r0 != 0) goto L72
            r0 = r12
            if (r0 != 0) goto L72
            r0 = r13
            if (r0 == 0) goto L7c
        L72:
            r0 = r5
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.Accessors r0 = (lombok.experimental.Accessors) r0
            goto L7d
        L7c:
            r0 = 0
        L7d:
            r14 = r0
            r0 = r11
            if (r0 == 0) goto L91
            r0 = r14
            java.lang.String[] r0 = r0.prefix()
            java.util.List r0 = java.util.Arrays.asList(r0)
            goto L9b
        L91:
            r0 = r4
            lombok.core.configuration.ConfigurationKey<java.util.List<java.lang.String>> r1 = lombok.ConfigurationKeys.ACCESSORS_PREFIX
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.util.List r0 = (java.util.List) r0
        L9b:
            r15 = r0
            r0 = r12
            if (r0 == 0) goto Lac
            r0 = r14
            boolean r0 = r0.fluent()
            goto Lb9
        Lac:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r4
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ACCESSORS_FLUENT
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        Lb9:
            r16 = r0
            r0 = r4
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.CapitalizationStrategy> r1 = lombok.ConfigurationKeys.ACCESSORS_JAVA_BEANS_SPEC_CAPITALIZATION
            lombok.core.configuration.CapitalizationStrategy r2 = lombok.core.configuration.CapitalizationStrategy.defaultValue()
            java.lang.Object r0 = r0.readConfigurationOr(r1, r2)
            lombok.core.configuration.CapitalizationStrategy r0 = (lombok.core.configuration.CapitalizationStrategy) r0
            r17 = r0
            r0 = r6
            r1 = r15
            java.lang.CharSequence r0 = removePrefix(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Ld7
            r0 = 0
            return r0
        Ld7:
            r0 = r6
            java.lang.String r0 = r0.toString()
            r18 = r0
            r0 = r10
            if (r0 == 0) goto Lec
            r0 = r16
            if (r0 == 0) goto Lec
            r0 = r18
            return r0
        Lec:
            r0 = r7
            if (r0 == 0) goto L12b
            r0 = r18
            java.lang.String r1 = "is"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L12b
            r0 = r6
            int r0 = r0.length()
            r1 = 2
            if (r0 <= r1) goto L12b
            r0 = r6
            r1 = 2
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 != 0) goto L12b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r8
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r18
            r2 = 2
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L12b:
            r0 = r7
            if (r0 == 0) goto L134
            r0 = r8
            goto L136
        L134:
            r0 = r9
        L136:
            r1 = r18
            r2 = r17
            java.lang.String r0 = buildAccessorName(r0, r1, r2)
            return r0
    }

    public static java.util.List<java.lang.String> toAllGetterNames(lombok.core.AST<?, ?, ?> r8, lombok.core.AnnotationValues<lombok.experimental.Accessors> r9, java.lang.CharSequence r10, boolean r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.String r4 = "is"
            java.lang.String r5 = "get"
            r6 = 1
            java.util.List r0 = toAllAccessorNames(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static java.util.List<java.lang.String> toAllSetterNames(lombok.core.AST<?, ?, ?> r8, lombok.core.AnnotationValues<lombok.experimental.Accessors> r9, java.lang.CharSequence r10, boolean r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.String r4 = "set"
            java.lang.String r5 = "set"
            r6 = 1
            java.util.List r0 = toAllAccessorNames(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithNames(lombok.core.AST<?, ?, ?> r8, lombok.core.AnnotationValues<lombok.experimental.Accessors> r9, java.lang.CharSequence r10, boolean r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.String r4 = "with"
            java.lang.String r5 = "with"
            r6 = 0
            java.util.List r0 = toAllAccessorNames(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithByNames(lombok.core.AST<?, ?, ?> r8, lombok.core.AnnotationValues<lombok.experimental.Accessors> r9, java.lang.CharSequence r10, boolean r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.String r4 = "with"
            java.lang.String r5 = "with"
            r6 = 0
            java.util.List r0 = toAllAccessorNames(r0, r1, r2, r3, r4, r5, r6)
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof java.util.ArrayList
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            r12 = r0
        L23:
            r0 = 0
            r13 = r0
            goto L55
        L29:
            r0 = r12
            r1 = r13
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r12
            r5 = r13
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.lang.String r3 = "By"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.set(r1, r2)
            int r13 = r13 + 1
        L55:
            r0 = r13
            r1 = r12
            int r1 = r1.size()
            if (r0 < r1) goto L29
            r0 = r12
            return r0
    }

    private static java.util.List<java.lang.String> toAllAccessorNames(lombok.core.AST<?, ?, ?> r8, lombok.core.AnnotationValues<lombok.experimental.Accessors> r9, java.lang.CharSequence r10, boolean r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r8
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.GETTER_CONSEQUENT_BOOLEAN
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            r0 = 0
            r11 = r0
        L12:
            r0 = r11
            if (r0 != 0) goto L36
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.String r0 = toAccessorName(r0, r1, r2, r3, r4, r5, r6)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L30
            java.util.List r0 = java.util.Collections.emptyList()
            goto L35
        L30:
            r0 = r15
            java.util.List r0 = java.util.Collections.singletonList(r0)
        L35:
            return r0
        L36:
            r0 = r9
            if (r0 == 0) goto L48
            r0 = r9
            java.lang.String r1 = "prefix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto L48
            r0 = 1
            goto L49
        L48:
            r0 = 0
        L49:
            r15 = r0
            r0 = r9
            if (r0 == 0) goto L5d
            r0 = r9
            java.lang.String r1 = "fluent"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto L5d
            r0 = 1
            goto L5e
        L5d:
            r0 = 0
        L5e:
            r16 = r0
            r0 = r15
            if (r0 != 0) goto L6a
            r0 = r16
            if (r0 == 0) goto L74
        L6a:
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.Accessors r0 = (lombok.experimental.Accessors) r0
            goto L75
        L74:
            r0 = 0
        L75:
            r17 = r0
            r0 = r15
            if (r0 == 0) goto L89
            r0 = r17
            java.lang.String[] r0 = r0.prefix()
            java.util.List r0 = java.util.Arrays.asList(r0)
            goto L93
        L89:
            r0 = r8
            lombok.core.configuration.ConfigurationKey<java.util.List<java.lang.String>> r1 = lombok.ConfigurationKeys.ACCESSORS_PREFIX
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.util.List r0 = (java.util.List) r0
        L93:
            r18 = r0
            r0 = r16
            if (r0 == 0) goto La4
            r0 = r17
            boolean r0 = r0.fluent()
            goto Lb1
        La4:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r8
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ACCESSORS_FLUENT
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        Lb1:
            r19 = r0
            r0 = r8
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.CapitalizationStrategy> r1 = lombok.ConfigurationKeys.ACCESSORS_JAVA_BEANS_SPEC_CAPITALIZATION
            lombok.core.configuration.CapitalizationStrategy r2 = lombok.core.configuration.CapitalizationStrategy.defaultValue()
            java.lang.Object r0 = r0.readConfigurationOr(r1, r2)
            lombok.core.configuration.CapitalizationStrategy r0 = (lombok.core.configuration.CapitalizationStrategy) r0
            r20 = r0
            r0 = r10
            r1 = r18
            java.lang.CharSequence r0 = removePrefix(r0, r1)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto Ld1
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        Ld1:
            r0 = r10
            r1 = r11
            r2 = r19
            java.util.List r0 = toBaseNames(r0, r1, r2)
            r21 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r21
            java.util.Iterator r0 = r0.iterator()
            r24 = r0
            goto L13e
        Lef:
            r0 = r24
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r23 = r0
            r0 = r14
            if (r0 == 0) goto L112
            r0 = r19
            if (r0 == 0) goto L112
            r0 = r22
            r1 = r23
            boolean r0 = r0.add(r1)
            goto L13e
        L112:
            r0 = r22
            r1 = r13
            r2 = r23
            r3 = r20
            java.lang.String r1 = buildAccessorName(r1, r2, r3)
            boolean r0 = r0.add(r1)
            r0 = r13
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13e
            r0 = r22
            r1 = r12
            r2 = r23
            r3 = r20
            java.lang.String r1 = buildAccessorName(r1, r2, r3)
            boolean r0 = r0.add(r1)
        L13e:
            r0 = r24
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lef
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r22
            r1.<init>(r2)
            return r0
    }

    private static java.util.List<java.lang.String> toBaseNames(java.lang.CharSequence r5, boolean r6, boolean r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r5
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "is"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L7b
            r0 = r9
            int r0 = r0.length()
            r1 = 2
            if (r0 <= r1) goto L7b
            r0 = r9
            r1 = 2
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 != 0) goto L7b
            r0 = r9
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            r10 = r0
            r0 = r7
            if (r0 == 0) goto L72
            r0 = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r10
            r3 = 0
            char r2 = r2.charAt(r3)
            char r2 = java.lang.Character.toLowerCase(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            r3 = 1
            java.lang.String r2 = r2.substring(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            goto L7b
        L72:
            r0 = r8
            r1 = r10
            boolean r0 = r0.add(r1)
        L7b:
            r0 = r8
            return r0
    }

    public static java.lang.String buildAccessorName(lombok.core.AST<?, ?, ?> r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.CapitalizationStrategy> r1 = lombok.ConfigurationKeys.ACCESSORS_JAVA_BEANS_SPEC_CAPITALIZATION
            lombok.core.configuration.CapitalizationStrategy r2 = lombok.core.configuration.CapitalizationStrategy.defaultValue()
            java.lang.Object r0 = r0.readConfigurationOr(r1, r2)
            lombok.core.configuration.CapitalizationStrategy r0 = (lombok.core.configuration.CapitalizationStrategy) r0
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r0 = buildAccessorName(r0, r1, r2)
            return r0
    }

    public static java.lang.String buildAccessorName(lombok.core.LombokNode<?, ?, ?> r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.CapitalizationStrategy> r1 = lombok.ConfigurationKeys.ACCESSORS_JAVA_BEANS_SPEC_CAPITALIZATION
            lombok.core.configuration.CapitalizationStrategy r2 = lombok.core.configuration.CapitalizationStrategy.defaultValue()
            java.lang.Object r0 = r0.readConfigurationOr(r1, r2)
            lombok.core.configuration.CapitalizationStrategy r0 = (lombok.core.configuration.CapitalizationStrategy) r0
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r0 = buildAccessorName(r0, r1, r2)
            return r0
    }

    private static java.lang.String buildAccessorName(java.lang.String r4, java.lang.String r5, lombok.core.configuration.CapitalizationStrategy r6) {
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L9
            r0 = r4
            return r0
        L9:
            r0 = r4
            int r0 = r0.length()
            if (r0 != 0) goto L12
            r0 = r5
            return r0
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r6
            r2 = r5
            java.lang.String r1 = r1.capitalize(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String camelCaseToConstant(java.lang.String r4) {
            r0 = r4
            if (r0 == 0) goto Lb
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
        Lb:
            java.lang.String r0 = ""
            return r0
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = r4
            r2 = 0
            char r1 = r1.charAt(r2)
            char r1 = java.lang.Character.toUpperCase(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r6 = r0
            goto L49
        L29:
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 == 0) goto L3d
            r0 = r5
            r1 = 95
            java.lang.StringBuilder r0 = r0.append(r1)
        L3d:
            r0 = r5
            r1 = r7
            char r1 = java.lang.Character.toUpperCase(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6 + 1
        L49:
            r0 = r6
            r1 = r4
            int r1 = r1.length()
            if (r0 < r1) goto L29
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static int defaultEqualsAndHashcodeIncludeRank(java.lang.String r3) {
            r0 = r3
            boolean r0 = lombok.core.JavaIdentifiers.isPrimitive(r0)
            if (r0 == 0) goto Lb
            r0 = 1000(0x3e8, float:1.401E-42)
            return r0
        Lb:
            java.util.regex.Pattern r0 = lombok.core.handlers.HandlerUtil.PRIMITIVE_WRAPPER_TYPE_NAME_PATTERN
            r1 = r3
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L1c
            r0 = 800(0x320, float:1.121E-42)
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public static java.lang.String stripLinesWithTagFromJavadoc(java.lang.String r3, lombok.core.handlers.HandlerUtil.JavadocTag r4) {
            r0 = r3
            if (r0 == 0) goto Lb
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
        Lb:
            r0 = r3
            return r0
        Ld:
            r0 = r4
            java.util.regex.Pattern r0 = lombok.core.handlers.HandlerUtil.JavadocTag.access$2(r0)
            r1 = r3
            java.util.regex.Matcher r0 = r0.matcher(r1)
            java.lang.String r1 = ""
            java.lang.String r0 = r0.replaceAll(r1)
            java.lang.String r0 = r0.trim()
            return r0
    }

    public static java.lang.String stripSectionsFromJavadoc(java.lang.String r4) {
            r0 = r4
            if (r0 == 0) goto Lb
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
        Lb:
            r0 = r4
            return r0
        Ld:
            java.util.regex.Pattern r0 = lombok.core.handlers.HandlerUtil.SECTION_FINDER
            r1 = r4
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0.find()
            if (r0 != 0) goto L1e
            r0 = r4
            return r0
        L1e:
            r0 = r4
            r1 = 0
            r2 = r5
            int r2 = r2.start()
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public static java.lang.String getJavadocSection(java.lang.String r4, java.lang.String r5) {
            r0 = r4
            if (r0 == 0) goto Lb
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = r5
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            r6 = r0
            java.util.regex.Pattern r0 = lombok.core.handlers.HandlerUtil.SECTION_FINDER
            r1 = r4
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r7 = r0
            java.util.regex.Pattern r0 = lombok.core.handlers.HandlerUtil.LINE_BREAK_FINDER
            r1 = r4
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r8 = r0
            r0 = -1
            r9 = r0
            r0 = -1
            r10 = r0
            goto L88
        L2f:
            r0 = 0
            r11 = r0
            r0 = r6
            r1 = r0
            r15 = r1
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r13 = r0
            goto L5c
        L3f:
            r0 = r15
            r1 = r13
            r0 = r0[r1]
            r12 = r0
            r0 = r7
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            r1 = r12
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L59
            r0 = 1
            r11 = r0
            goto L63
        L59:
            int r13 = r13 + 1
        L5c:
            r0 = r13
            r1 = r14
            if (r0 < r1) goto L3f
        L63:
            r0 = r11
            if (r0 == 0) goto L7c
            r0 = r8
            r1 = r7
            int r1 = r1.end()
            boolean r0 = r0.find(r1)
            r0 = r8
            int r0 = r0.end()
            r9 = r0
            goto L88
        L7c:
            r0 = r9
            r1 = -1
            if (r0 == r1) goto L88
            r0 = r7
            int r0 = r0.start()
            r10 = r0
        L88:
            r0 = r7
            boolean r0 = r0.find()
            if (r0 != 0) goto L2f
            r0 = r9
            r1 = -1
            if (r0 == r1) goto Lab
            r0 = r10
            r1 = -1
            if (r0 == r1) goto La4
            r0 = r4
            r1 = r9
            r2 = r10
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
        La4:
            r0 = r4
            r1 = r9
            java.lang.String r0 = r0.substring(r1)
            return r0
        Lab:
            r0 = 0
            return r0
    }

    public static java.lang.String addReturnsThisIfNeeded(java.lang.String r3) {
            r0 = r3
            if (r0 == 0) goto L13
            java.util.regex.Pattern r0 = lombok.core.handlers.HandlerUtil.FIND_RETURN
            r1 = r3
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.find()
            if (r0 == 0) goto L13
            r0 = r3
            return r0
        L13:
            r0 = r3
            java.lang.String r1 = "@return {@code this}."
            java.lang.String r0 = addJavadocLine(r0, r1)
            return r0
    }

    public static java.lang.String addReturnsUpdatedSelfIfNeeded(java.lang.String r3) {
            r0 = r3
            if (r0 == 0) goto L13
            java.util.regex.Pattern r0 = lombok.core.handlers.HandlerUtil.FIND_RETURN
            r1 = r3
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.find()
            if (r0 == 0) goto L13
            r0 = r3
            return r0
        L13:
            r0 = r3
            java.lang.String r1 = "@return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed)."
            java.lang.String r0 = addJavadocLine(r0, r1)
            return r0
    }

    public static java.lang.String addJavadocLine(java.lang.String r4, java.lang.String r5) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = r5
            return r0
        L6:
            r0 = r4
            java.lang.String r1 = "\n"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getParamJavadoc(java.lang.String r4, java.lang.String r5) {
            r0 = r4
            if (r0 == 0) goto Lb
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
        Lb:
            r0 = r4
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "@param "
            r1.<init>(r2)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " (\\S|\\s)+?(?=^ ?@)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 10
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r4
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0.find()
            if (r0 == 0) goto L3c
            r0 = r7
            java.lang.String r0 = r0.group()
            return r0
        L3c:
            r0 = 0
            return r0
    }
}
