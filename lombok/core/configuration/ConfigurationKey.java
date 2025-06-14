package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationKey.SCL.lombok */
public abstract class ConfigurationKey<T> {
    private static final java.util.regex.Pattern VALID_NAMES = null;
    private static final java.util.TreeMap<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> registeredKeys = null;
    private static java.util.Map<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> copy;
    private final java.lang.String keyName;
    private final java.lang.String description;
    private final lombok.core.configuration.ConfigurationDataType type;
    private final boolean hidden;

    static {
            java.lang.String r0 = "[-_a-zA-Z][-.\\w]*(?<![-.])"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.core.configuration.ConfigurationKey.VALID_NAMES = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r1 = r0
            java.util.Comparator r2 = java.lang.String.CASE_INSENSITIVE_ORDER
            r1.<init>(r2)
            lombok.core.configuration.ConfigurationKey.registeredKeys = r0
            return
    }

    public ConfigurationKey(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public ConfigurationKey(java.lang.String r4, java.lang.String r5, boolean r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            java.lang.String r1 = checkName(r1)
            r0.keyName = r1
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            lombok.core.configuration.ConfigurationDataType r0 = lombok.core.configuration.ConfigurationDataType.toDataType(r0)
            r7 = r0
            r0 = r3
            r1 = r7
            r0.type = r1
            r0 = r3
            r1 = r5
            r0.description = r1
            r0 = r3
            r1 = r6
            r0.hidden = r1
            r0 = r4
            r1 = r3
            registerKey(r0, r1)
            return
    }

    public final java.lang.String getKeyName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.keyName
            return r0
    }

    public final java.lang.String getDescription() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.description
            return r0
    }

    public final lombok.core.configuration.ConfigurationDataType getType() {
            r2 = this;
            r0 = r2
            lombok.core.configuration.ConfigurationDataType r0 = r0.type
            return r0
    }

    public final boolean isHidden() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.hidden
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            java.lang.String r2 = r2.keyName
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            lombok.core.configuration.ConfigurationDataType r1 = r1.type
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "): "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.description
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String checkName(java.lang.String r6) {
            r0 = r6
            if (r0 != 0) goto Le
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "keyName"
            r1.<init>(r2)
            throw r0
        Le:
            java.util.regex.Pattern r0 = lombok.core.configuration.ConfigurationKey.VALID_NAMES
            r1 = r6
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L33
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Invalid keyName: "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r6
            return r0
    }

    public static java.util.Map<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> registeredKeys() {
            java.util.TreeMap<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> r0 = lombok.core.configuration.ConfigurationKey.registeredKeys
            r1 = r0
            r3 = r1
            monitor-enter(r0)
            java.util.Map<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> r0 = lombok.core.configuration.ConfigurationKey.copy     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L1b
            java.util.TreeMap<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> r0 = lombok.core.configuration.ConfigurationKey.registeredKeys     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> L21
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L21
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> L21
            lombok.core.configuration.ConfigurationKey.copy = r0     // Catch: java.lang.Throwable -> L21
        L1b:
            java.util.Map<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> r0 = lombok.core.configuration.ConfigurationKey.copy     // Catch: java.lang.Throwable -> L21
            r1 = r3
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            r1 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
    }

    private static void registerKey(java.lang.String r6, lombok.core.configuration.ConfigurationKey<?> r7) {
            java.util.TreeMap<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> r0 = lombok.core.configuration.ConfigurationKey.registeredKeys
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            java.util.TreeMap<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> r0 = lombok.core.configuration.ConfigurationKey.registeredKeys     // Catch: java.lang.Throwable -> L3f
            r1 = r6
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L2d
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3f
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r3 = r2
            java.lang.String r4 = "Key '"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "' already registered"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            throw r0     // Catch: java.lang.Throwable -> L3f
        L2d:
            java.util.TreeMap<java.lang.String, lombok.core.configuration.ConfigurationKey<?>> r0 = lombok.core.configuration.ConfigurationKey.registeredKeys     // Catch: java.lang.Throwable -> L3f
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3f
            r0 = 0
            lombok.core.configuration.ConfigurationKey.copy = r0     // Catch: java.lang.Throwable -> L3f
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r1 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r0     // Catch: java.lang.Throwable -> L3f
        L42:
            return
    }
}
