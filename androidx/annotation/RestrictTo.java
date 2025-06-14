package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PACKAGE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface RestrictTo {

    public enum Scope extends java.lang.Enum<androidx.annotation.RestrictTo.Scope> {
        private static final /* synthetic */ androidx.annotation.RestrictTo.Scope[] $VALUES = null;

        @java.lang.Deprecated
        public static final androidx.annotation.RestrictTo.Scope GROUP_ID = null;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY = null;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY_GROUP = null;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY_GROUP_PREFIX = null;
        public static final androidx.annotation.RestrictTo.Scope SUBCLASSES = null;
        public static final androidx.annotation.RestrictTo.Scope TESTS = null;

        static {
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "LIBRARY"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.LIBRARY = r0
                androidx.annotation.RestrictTo$Scope r1 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r3 = "LIBRARY_GROUP"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP = r1
                androidx.annotation.RestrictTo$Scope r3 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r5 = "LIBRARY_GROUP_PREFIX"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX = r3
                androidx.annotation.RestrictTo$Scope r5 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r7 = "GROUP_ID"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.annotation.RestrictTo.Scope.GROUP_ID = r5
                androidx.annotation.RestrictTo$Scope r7 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r9 = "TESTS"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.annotation.RestrictTo.Scope.TESTS = r7
                androidx.annotation.RestrictTo$Scope r9 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r11 = "SUBCLASSES"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.annotation.RestrictTo.Scope.SUBCLASSES = r9
                r11 = 6
                androidx.annotation.RestrictTo$Scope[] r11 = new androidx.annotation.RestrictTo.Scope[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                androidx.annotation.RestrictTo.Scope.$VALUES = r11
                return
        }

        Scope(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.annotation.RestrictTo.Scope valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.RestrictTo$Scope> r0 = androidx.annotation.RestrictTo.Scope.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.RestrictTo$Scope r1 = (androidx.annotation.RestrictTo.Scope) r1
                return r1
        }

        public static androidx.annotation.RestrictTo.Scope[] values() {
                androidx.annotation.RestrictTo$Scope[] r0 = androidx.annotation.RestrictTo.Scope.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.RestrictTo$Scope[] r0 = (androidx.annotation.RestrictTo.Scope[]) r0
                return r0
        }
    }

    androidx.annotation.RestrictTo.Scope[] value();
}
