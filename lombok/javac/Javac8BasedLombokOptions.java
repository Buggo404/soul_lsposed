package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/Javac8BasedLombokOptions.SCL.lombok */
public class Javac8BasedLombokOptions extends lombok.javac.LombokOptions {
    public static lombok.javac.Javac8BasedLombokOptions replaceWithDelombokOptions(com.sun.tools.javac.util.Context r4) {
            r0 = r4
            com.sun.tools.javac.util.Options r0 = com.sun.tools.javac.util.Options.instance(r0)
            r5 = r0
            r0 = r4
            com.sun.tools.javac.util.Context$Key r1 = lombok.javac.Javac8BasedLombokOptions.optionsKey
            r2 = 0
            r0.put(r1, r2)
            lombok.javac.Javac8BasedLombokOptions r0 = new lombok.javac.Javac8BasedLombokOptions
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

    private Javac8BasedLombokOptions(com.sun.tools.javac.util.Context r4) {
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
            com.sun.tools.javac.main.Option r0 = com.sun.tools.javac.main.Option.valueOf(r0)
            java.lang.String r0 = r0.text
            r7 = r0
            r0 = r4
            r1 = r7
            r2 = r6
            r0.put(r1, r2)
            return
    }
}
