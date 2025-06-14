package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationSource.SCL.lombok */
public interface ConfigurationSource {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationSource$ListModification.SCL.lombok */
    public static final class ListModification {
        private final java.lang.Object value;
        private final boolean added;

        public ListModification(java.lang.Object r4, boolean r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.value = r1
                r0 = r3
                r1 = r5
                r0.added = r1
                return
        }

        public java.lang.Object getValue() {
                r2 = this;
                r0 = r2
                java.lang.Object r0 = r0.value
                return r0
        }

        public boolean isAdded() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.added
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationSource$Result.SCL.lombok */
    public static final class Result {
        private final java.lang.Object value;
        private final boolean authoritative;

        public Result(java.lang.Object r4, boolean r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.value = r1
                r0 = r3
                r1 = r5
                r0.authoritative = r1
                return
        }

        public java.lang.Object getValue() {
                r2 = this;
                r0 = r2
                java.lang.Object r0 = r0.value
                return r0
        }

        public boolean isAuthoritative() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.authoritative
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = r4
                java.lang.Object r2 = r2.value
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.<init>(r2)
                r1 = r4
                boolean r1 = r1.authoritative
                if (r1 == 0) goto L1d
                java.lang.String r1 = " (set)"
                goto L1f
            L1d:
                java.lang.String r1 = " (delta)"
            L1f:
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    lombok.core.configuration.ConfigurationSource.Result resolve(lombok.core.configuration.ConfigurationKey<?> r1);

    java.util.List<lombok.core.configuration.ConfigurationFile> imports();
}
