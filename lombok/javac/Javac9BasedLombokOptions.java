package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/Javac9BasedLombokOptions.SCL.lombok */
public class Javac9BasedLombokOptions extends lombok.javac.LombokOptions {
    public static lombok.javac.Javac9BasedLombokOptions replaceWithDelombokOptions(com.sun.tools.javac.util.Context r4) {
            r0 = r4
            com.sun.tools.javac.util.Options r0 = com.sun.tools.javac.util.Options.instance(r0)
            r5 = r0
            r0 = r4
            com.sun.tools.javac.util.Context$Key r1 = lombok.javac.Javac9BasedLombokOptions.optionsKey
            r2 = 0
            r0.put(r1, r2)
            lombok.javac.Javac9BasedLombokOptions r0 = new lombok.javac.Javac9BasedLombokOptions
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            r0.putAll(r1)
            r0 = r6
            return r0
    }

    private Javac9BasedLombokOptions(com.sun.tools.javac.util.Context r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // lombok.javac.LombokOptions
    public void putJavacOption(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "CLASSPATH"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "CLASS_PATH"
            r5 = r0
        Lc:
            r0 = r5
            java.lang.String r1 = "SOURCEPATH"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            java.lang.String r0 = "SOURCE_PATH"
            r5 = r0
        L18:
            r0 = r5
            java.lang.String r1 = "BOOTCLASSPATH"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            java.lang.String r0 = "BOOT_CLASS_PATH"
            r5 = r0
        L24:
            r0 = r5
            com.sun.tools.javac.main.Option r0 = com.sun.tools.javac.main.Option.valueOf(r0)
            java.lang.String r0 = r0.primaryName
            r7 = r0
            r0 = r4
            r1 = r7
            r2 = r6
            r0.put(r1, r2)
            return
    }
}
