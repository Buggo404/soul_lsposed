package androidx.annotation.experimental;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface Experimental {

    public enum Level extends java.lang.Enum<androidx.annotation.experimental.Experimental.Level> {
        private static final /* synthetic */ androidx.annotation.experimental.Experimental.Level[] $VALUES = null;
        public static final androidx.annotation.experimental.Experimental.Level ERROR = null;
        public static final androidx.annotation.experimental.Experimental.Level WARNING = null;

        static {
                androidx.annotation.experimental.Experimental$Level r0 = new androidx.annotation.experimental.Experimental$Level
                java.lang.String r1 = "WARNING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.experimental.Experimental.Level.WARNING = r0
                androidx.annotation.experimental.Experimental$Level r1 = new androidx.annotation.experimental.Experimental$Level
                java.lang.String r3 = "ERROR"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.annotation.experimental.Experimental.Level.ERROR = r1
                r3 = 2
                androidx.annotation.experimental.Experimental$Level[] r3 = new androidx.annotation.experimental.Experimental.Level[r3]
                r3[r2] = r0
                r3[r4] = r1
                androidx.annotation.experimental.Experimental.Level.$VALUES = r3
                return
        }

        Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.annotation.experimental.Experimental.Level valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.experimental.Experimental$Level> r0 = androidx.annotation.experimental.Experimental.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.experimental.Experimental$Level r1 = (androidx.annotation.experimental.Experimental.Level) r1
                return r1
        }

        public static androidx.annotation.experimental.Experimental.Level[] values() {
                androidx.annotation.experimental.Experimental$Level[] r0 = androidx.annotation.experimental.Experimental.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.experimental.Experimental$Level[] r0 = (androidx.annotation.experimental.Experimental.Level[]) r0
                return r0
        }
    }

    androidx.annotation.experimental.Experimental.Level level() default androidx.annotation.experimental.Experimental.Level.ERROR;
}
