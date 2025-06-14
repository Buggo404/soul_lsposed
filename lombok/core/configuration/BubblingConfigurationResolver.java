package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/BubblingConfigurationResolver.SCL.lombok */
public class BubblingConfigurationResolver implements lombok.core.configuration.ConfigurationResolver {
    private final lombok.core.configuration.ConfigurationFile start;
    private final lombok.core.configuration.ConfigurationFileToSource fileMapper;

    public BubblingConfigurationResolver(lombok.core.configuration.ConfigurationFile r4, lombok.core.configuration.ConfigurationFileToSource r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.start = r1
            r0 = r3
            r1 = r5
            r0.fileMapper = r1
            return
    }

    @Override // lombok.core.configuration.ConfigurationResolver
    public <T> T resolve(lombok.core.configuration.ConfigurationKey<T> r4) {
            r3 = this;
            r0 = r4
            lombok.core.configuration.ConfigurationDataType r0 = r0.getType()
            boolean r0 = r0.isList()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r3
            lombok.core.configuration.ConfigurationFile r0 = r0.start
            r8 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r9 = r0
            goto L11b
        L1f:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r8
            r0.push(r1)
            goto L10a
        L34:
            r0 = r10
            java.lang.Object r0 = r0.pop()
            lombok.core.configuration.ConfigurationFile r0 = (lombok.core.configuration.ConfigurationFile) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L10a
            r0 = r9
            r1 = r11
            boolean r0 = r0.add(r1)
            if (r0 != 0) goto L54
            goto L10a
        L54:
            r0 = r3
            lombok.core.configuration.ConfigurationFileToSource r0 = r0.fileMapper
            r1 = r11
            lombok.core.configuration.ConfigurationSource r0 = r0.parsed(r1)
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L69
            goto L10a
        L69:
            r0 = r12
            java.util.List r0 = r0.imports()
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L8f
        L7a:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.ConfigurationFile r0 = (lombok.core.configuration.ConfigurationFile) r0
            r13 = r0
            r0 = r10
            r1 = r13
            r0.push(r1)
        L8f:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7a
            r0 = r12
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.STOP_BUBBLING
            lombok.core.configuration.ConfigurationSource$Result r0 = r0.resolve(r1)
            r13 = r0
            r0 = r7
            if (r0 != 0) goto Lc1
            r0 = r13
            if (r0 == 0) goto Lbd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r13
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lc1
        Lbd:
            r0 = 0
            goto Lc2
        Lc1:
            r0 = 1
        Lc2:
            r7 = r0
            r0 = r12
            r1 = r4
            lombok.core.configuration.ConfigurationSource$Result r0 = r0.resolve(r1)
            r14 = r0
            r0 = r14
            if (r0 != 0) goto Ld6
            goto L10a
        Ld6:
            r0 = r5
            if (r0 == 0) goto Lf5
            r0 = r6
            if (r0 != 0) goto Le6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
        Le6:
            r0 = r6
            r1 = r14
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r0.add(r1)
        Lf5:
            r0 = r14
            boolean r0 = r0.isAuthoritative()
            if (r0 == 0) goto L10a
            r0 = r5
            if (r0 == 0) goto L104
            goto L125
        L104:
            r0 = r14
            java.lang.Object r0 = r0.getValue()
            return r0
        L10a:
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L34
            r0 = r8
            lombok.core.configuration.ConfigurationFile r0 = r0.parent()
            r8 = r0
        L11b:
            r0 = r7
            if (r0 != 0) goto L125
            r0 = r8
            if (r0 != 0) goto L1f
        L125:
            r0 = r5
            if (r0 != 0) goto L12b
            r0 = 0
            return r0
        L12b:
            r0 = r6
            if (r0 != 0) goto L133
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L133:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r6
            java.util.Collections.reverse(r0)
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L1a0
        L14b:
            r0 = r12
            java.lang.Object r0 = r0.next()
            java.util.List r0 = (java.util.List) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L1a0
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L196
        L168:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.ConfigurationSource$ListModification r0 = (lombok.core.configuration.ConfigurationSource.ListModification) r0
            r13 = r0
            r0 = r10
            r1 = r13
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r0.remove(r1)
            r0 = r13
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L196
            r0 = r10
            r1 = r13
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r0.add(r1)
        L196:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L168
        L1a0:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14b
            r0 = r10
            return r0
    }
}
