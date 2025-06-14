package lombok.delombok;

/* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/LombokOptionsFactory.SCL.lombok */
public class LombokOptionsFactory {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/LombokOptionsFactory$LombokOptionCompilerVersion.SCL.lombok */
    enum LombokOptionCompilerVersion extends java.lang.Enum<lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion> {
        public static final lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion JDK7_AND_LOWER = null;
        public static final lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion JDK8 = null;
        public static final lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion JDK9 = null;
        private static final /* synthetic */ lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion[] ENUM$VALUES = null;




        static {
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion$1 r0 = new lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion$1
                r1 = r0
                java.lang.String r2 = "JDK7_AND_LOWER"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.JDK7_AND_LOWER = r0
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion$2 r0 = new lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion$2
                r1 = r0
                java.lang.String r2 = "JDK8"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.JDK8 = r0
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion$3 r0 = new lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion$3
                r1 = r0
                java.lang.String r2 = "JDK9"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.JDK9 = r0
                r0 = 3
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion[] r0 = new lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion[r0]
                r1 = r0
                r2 = 0
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion r3 = lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.JDK7_AND_LOWER
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion r3 = lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.JDK8
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion r3 = lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.JDK9
                r1[r2] = r3
                lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.ENUM$VALUES = r0
                return
        }

        LombokOptionCompilerVersion(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        abstract lombok.javac.LombokOptions createAndRegisterOptions(com.sun.tools.javac.util.Context r1);

        public static lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion[] values() {
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion[] r0 = lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion[] r2 = new lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion valueOf(java.lang.String r3) {
                java.lang.Class<lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion> r0 = lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion r0 = (lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion) r0
                return r0
        }

        /* synthetic */ LombokOptionCompilerVersion(java.lang.String r5, int r6, lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }
    }

    public LombokOptionsFactory() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static lombok.javac.LombokOptions getDelombokOptions(com.sun.tools.javac.util.Context r3) {
            r0 = r3
            com.sun.tools.javac.util.Options r0 = com.sun.tools.javac.util.Options.instance(r0)
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof lombok.javac.LombokOptions
            if (r0 == 0) goto L11
            r0 = r4
            lombok.javac.LombokOptions r0 = (lombok.javac.LombokOptions) r0
            return r0
        L11:
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 8
            if (r0 >= r1) goto L24
            lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion r0 = lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.JDK7_AND_LOWER
            r1 = r3
            lombok.javac.LombokOptions r0 = r0.createAndRegisterOptions(r1)
            r5 = r0
            goto L3f
        L24:
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 8
            if (r0 != r1) goto L37
            lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion r0 = lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.JDK8
            r1 = r3
            lombok.javac.LombokOptions r0 = r0.createAndRegisterOptions(r1)
            r5 = r0
            goto L3f
        L37:
            lombok.delombok.LombokOptionsFactory$LombokOptionCompilerVersion r0 = lombok.delombok.LombokOptionsFactory.LombokOptionCompilerVersion.JDK9
            r1 = r3
            lombok.javac.LombokOptions r0 = r0.createAndRegisterOptions(r1)
            r5 = r0
        L3f:
            r0 = r5
            return r0
    }
}
