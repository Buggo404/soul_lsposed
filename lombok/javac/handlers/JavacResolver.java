package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacResolver.SCL.lombok */
public enum JavacResolver extends java.lang.Enum<lombok.javac.handlers.JavacResolver> {
    public static final lombok.javac.handlers.JavacResolver CLASS = null;
    public static final lombok.javac.handlers.JavacResolver METHOD = null;
    public static final lombok.javac.handlers.JavacResolver CLASS_AND_METHOD = null;
    private static final /* synthetic */ lombok.javac.handlers.JavacResolver[] ENUM$VALUES = null;




    static {
            lombok.javac.handlers.JavacResolver$1 r0 = new lombok.javac.handlers.JavacResolver$1
            r1 = r0
            java.lang.String r2 = "CLASS"
            r3 = 0
            r1.<init>(r2, r3)
            lombok.javac.handlers.JavacResolver.CLASS = r0
            lombok.javac.handlers.JavacResolver$2 r0 = new lombok.javac.handlers.JavacResolver$2
            r1 = r0
            java.lang.String r2 = "METHOD"
            r3 = 1
            r1.<init>(r2, r3)
            lombok.javac.handlers.JavacResolver.METHOD = r0
            lombok.javac.handlers.JavacResolver$3 r0 = new lombok.javac.handlers.JavacResolver$3
            r1 = r0
            java.lang.String r2 = "CLASS_AND_METHOD"
            r3 = 2
            r1.<init>(r2, r3)
            lombok.javac.handlers.JavacResolver.CLASS_AND_METHOD = r0
            r0 = 3
            lombok.javac.handlers.JavacResolver[] r0 = new lombok.javac.handlers.JavacResolver[r0]
            r1 = r0
            r2 = 0
            lombok.javac.handlers.JavacResolver r3 = lombok.javac.handlers.JavacResolver.CLASS
            r1[r2] = r3
            r1 = r0
            r2 = 1
            lombok.javac.handlers.JavacResolver r3 = lombok.javac.handlers.JavacResolver.METHOD
            r1[r2] = r3
            r1 = r0
            r2 = 2
            lombok.javac.handlers.JavacResolver r3 = lombok.javac.handlers.JavacResolver.CLASS_AND_METHOD
            r1[r2] = r3
            lombok.javac.handlers.JavacResolver.ENUM$VALUES = r0
            return
    }

    JavacResolver(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public abstract com.sun.tools.javac.code.Type resolveMember(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCExpression r2);

    public static lombok.javac.handlers.JavacResolver[] values() {
            lombok.javac.handlers.JavacResolver[] r0 = lombok.javac.handlers.JavacResolver.ENUM$VALUES
            r1 = r0
            r6 = r1
            r1 = 0
            r2 = r6
            int r2 = r2.length
            r3 = r2
            r7 = r3
            lombok.javac.handlers.JavacResolver[] r2 = new lombok.javac.handlers.JavacResolver[r2]
            r3 = r2
            r8 = r3
            r3 = 0
            r4 = r7
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            return r0
    }

    public static lombok.javac.handlers.JavacResolver valueOf(java.lang.String r3) {
            java.lang.Class<lombok.javac.handlers.JavacResolver> r0 = lombok.javac.handlers.JavacResolver.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            lombok.javac.handlers.JavacResolver r0 = (lombok.javac.handlers.JavacResolver) r0
            return r0
    }

    /* synthetic */ JavacResolver(java.lang.String r5, int r6, lombok.javac.handlers.JavacResolver r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }
}
