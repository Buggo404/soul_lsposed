package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/LombokInternalAliasing.SCL.lombok */
public class LombokInternalAliasing {
    public static final java.util.Map<java.lang.String, java.lang.String> ALIASES = null;
    public static final java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> REVERSE_ALIASES = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "lombok.experimental.Value"
            java.lang.String r2 = "lombok.Value"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "lombok.experimental.Builder"
            java.lang.String r2 = "lombok.Builder"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "lombok.experimental.var"
            java.lang.String r2 = "lombok.var"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "lombok.Delegate"
            java.lang.String r2 = "lombok.experimental.Delegate"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "lombok.experimental.Wither"
            java.lang.String r2 = "lombok.With"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            lombok.core.LombokInternalAliasing.ALIASES = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto Le1
        L5d:
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L9c
            r0 = r5
            r1 = r6
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2 = r6
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Set r2 = java.util.Collections.singleton(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            goto Le1
        L9c:
            r0 = r8
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto Ld0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = 2
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = r8
            boolean r0 = r0.addAll(r1)
            r0 = r5
            r1 = r6
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            goto Le1
        Ld0:
            r0 = r8
            r1 = r6
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.add(r1)
        Le1:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5d
            r0 = r5
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L128
        Lf9:
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r6 = r0
            r0 = r6
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r8 = r0
            r0 = r8
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L128
            r0 = r6
            r1 = r8
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.Object r0 = r0.setValue(r1)
        L128:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lf9
            r0 = r5
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            lombok.core.LombokInternalAliasing.REVERSE_ALIASES = r0
            return
    }

    public LombokInternalAliasing() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String processAliases(java.lang.String r3) {
            r0 = r3
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Map<java.lang.String, java.lang.String> r0 = lombok.core.LombokInternalAliasing.ALIASES
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L1b
            r0 = r3
            goto L1c
        L1b:
            r0 = r4
        L1c:
            return r0
    }
}
