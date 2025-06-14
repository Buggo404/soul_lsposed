package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/SingleConfigurationSource.SCL.lombok */
public final class SingleConfigurationSource implements lombok.core.configuration.ConfigurationSource {
    private final java.util.Map<lombok.core.configuration.ConfigurationKey<?>, lombok.core.configuration.ConfigurationSource.Result> values;
    private final java.util.List<lombok.core.configuration.ConfigurationFile> imports;


    public static lombok.core.configuration.ConfigurationSource parse(lombok.core.configuration.ConfigurationFile r5, lombok.core.configuration.ConfigurationParser r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            lombok.core.configuration.SingleConfigurationSource$1 r0 = new lombok.core.configuration.SingleConfigurationSource$1
            r1 = r0
            r2 = r8
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r6
            r1 = r5
            r2 = r9
            r0.parse(r1, r2)
            lombok.core.configuration.SingleConfigurationSource r0 = new lombok.core.configuration.SingleConfigurationSource
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    private SingleConfigurationSource(java.util.Map<lombok.core.configuration.ConfigurationKey<?>, lombok.core.configuration.ConfigurationSource.Result> r8, java.util.List<lombok.core.configuration.ConfigurationFile> r9) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.values = r1
            r0 = r8
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L82
        L1f:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r10 = r0
            r0 = r10
            java.lang.Object r0 = r0.getValue()
            lombok.core.configuration.ConfigurationSource$Result r0 = (lombok.core.configuration.ConfigurationSource.Result) r0
            r12 = r0
            r0 = r12
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof java.util.List
            if (r0 == 0) goto L6d
            r0 = r7
            java.util.Map<lombok.core.configuration.ConfigurationKey<?>, lombok.core.configuration.ConfigurationSource$Result> r0 = r0.values
            r1 = r10
            java.lang.Object r1 = r1.getKey()
            lombok.core.configuration.ConfigurationKey r1 = (lombok.core.configuration.ConfigurationKey) r1
            lombok.core.configuration.ConfigurationSource$Result r2 = new lombok.core.configuration.ConfigurationSource$Result
            r3 = r2
            r4 = r12
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            r5 = r12
            boolean r5 = r5.isAuthoritative()
            r3.<init>(r4, r5)
            java.lang.Object r0 = r0.put(r1, r2)
            goto L82
        L6d:
            r0 = r7
            java.util.Map<lombok.core.configuration.ConfigurationKey<?>, lombok.core.configuration.ConfigurationSource$Result> r0 = r0.values
            r1 = r10
            java.lang.Object r1 = r1.getKey()
            lombok.core.configuration.ConfigurationKey r1 = (lombok.core.configuration.ConfigurationKey) r1
            r2 = r12
            java.lang.Object r0 = r0.put(r1, r2)
        L82:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1f
            r0 = r7
            r1 = r9
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.imports = r1
            return
    }

    @Override // lombok.core.configuration.ConfigurationSource
    public lombok.core.configuration.ConfigurationSource.Result resolve(lombok.core.configuration.ConfigurationKey<?> r4) {
            r3 = this;
            r0 = r3
            java.util.Map<lombok.core.configuration.ConfigurationKey<?>, lombok.core.configuration.ConfigurationSource$Result> r0 = r0.values
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            lombok.core.configuration.ConfigurationSource$Result r0 = (lombok.core.configuration.ConfigurationSource.Result) r0
            return r0
    }

    @Override // lombok.core.configuration.ConfigurationSource
    public java.util.List<lombok.core.configuration.ConfigurationFile> imports() {
            r2 = this;
            r0 = r2
            java.util.List<lombok.core.configuration.ConfigurationFile> r0 = r0.imports
            return r0
    }
}
