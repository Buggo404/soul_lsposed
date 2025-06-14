package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/LombokOptions.SCL.lombok */
public abstract class LombokOptions extends com.sun.tools.javac.util.Options {
    private boolean deleteLombokAnnotations;
    private final java.util.Set<com.sun.tools.javac.tree.JCTree.JCCompilationUnit> changed;
    private lombok.delombok.FormatPreferences formatPreferences;

    public boolean isChanged(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r4) {
            r3 = this;
            r0 = r3
            java.util.Set<com.sun.tools.javac.tree.JCTree$JCCompilationUnit> r0 = r0.changed
            r1 = r4
            boolean r0 = r0.contains(r1)
            return r0
    }

    public void setFormatPreferences(lombok.delombok.FormatPreferences r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.formatPreferences = r1
            return
    }

    public lombok.delombok.FormatPreferences getFormatPreferences() {
            r2 = this;
            r0 = r2
            lombok.delombok.FormatPreferences r0 = r0.formatPreferences
            return r0
    }

    public static void markChanged(com.sun.tools.javac.util.Context r3, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r4) {
            r0 = r3
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            r5 = r0
            r0 = r5
            java.util.Set<com.sun.tools.javac.tree.JCTree$JCCompilationUnit> r0 = r0.changed
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    public static boolean shouldDeleteLombokAnnotations(com.sun.tools.javac.util.Context r2) {
            r0 = r2
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            r3 = r0
            r0 = r3
            boolean r0 = r0.deleteLombokAnnotations
            return r0
    }

    protected LombokOptions(com.sun.tools.javac.util.Context r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r0.<init>(r1)
            r0 = r5
            r1 = 0
            r0.deleteLombokAnnotations = r1
            r0 = r5
            java.util.HashSet r1 = new java.util.HashSet
            r2 = r1
            r2.<init>()
            r0.changed = r1
            r0 = r5
            lombok.delombok.FormatPreferences r1 = new lombok.delombok.FormatPreferences
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.formatPreferences = r1
            return
    }

    public abstract void putJavacOption(java.lang.String r1, java.lang.String r2);

    public void deleteLombokAnnotations() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.deleteLombokAnnotations = r1
            return
    }
}
