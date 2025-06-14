package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/TypeLibrary.SCL.lombok */
public class TypeLibrary {
    private final java.util.Map<java.lang.String, java.lang.Object> unqualifiedToQualifiedMap;
    private final java.lang.String unqualified;
    private final java.lang.String qualified;
    private boolean locked;

    public TypeLibrary() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.unqualifiedToQualifiedMap = r1
            r0 = r4
            r1 = 0
            r0.unqualified = r1
            r0 = r4
            r1 = 0
            r0.qualified = r1
            return
    }

    public TypeLibrary(lombok.core.TypeLibrary r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.unqualifiedToQualifiedMap = r1
            r0 = r4
            r1 = 0
            r0.unqualified = r1
            r0 = r4
            r1 = 0
            r0.qualified = r1
            return
    }

    public void lock() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.locked = r1
            return
    }

    private TypeLibrary(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            java.lang.String r1 = "$"
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 == r1) goto L2b
            r0 = r5
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.unqualifiedToQualifiedMap = r1
            r0 = r5
            r1 = 0
            r0.unqualified = r1
            r0 = r5
            r1 = 0
            r0.qualified = r1
            r0 = r5
            r1 = r6
            r0.addType(r1)
            goto L54
        L2b:
            r0 = r5
            r1 = 0
            r0.unqualifiedToQualifiedMap = r1
            r0 = r5
            r1 = r6
            r0.qualified = r1
            r0 = r6
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r7 = r0
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L49
            r0 = r5
            r1 = r6
            r0.unqualified = r1
            goto L54
        L49:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)
            r0.unqualified = r1
        L54:
            r0 = r5
            r1 = 1
            r0.locked = r1
            return
    }

    public static lombok.core.TypeLibrary createLibraryForSingleType(java.lang.String r4) {
            java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> r0 = lombok.core.LombokInternalAliasing.REVERSE_ALIASES
            r1 = r4
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1f
            lombok.core.TypeLibrary r0 = new lombok.core.TypeLibrary
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = r4
            r0.addType(r1)
            r0 = r5
            r0.lock()
            r0 = r5
            return r0
        L1f:
            lombok.core.TypeLibrary r0 = new lombok.core.TypeLibrary
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    public void addType(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> r0 = lombok.core.LombokInternalAliasing.REVERSE_ALIASES
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L36
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L2c
        L1c:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r5
            r1 = r8
            r0.addType(r1)
        L2c:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1c
        L36:
            r0 = r6
            java.lang.String r1 = "$"
            java.lang.String r2 = "."
            java.lang.String r0 = r0.replace(r1, r2)
            r8 = r0
            r0 = r5
            boolean r0 = r0.locked
            if (r0 == 0) goto L50
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "locked"
            r1.<init>(r2)
            throw r0
        L50:
            r0 = r6
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r9 = r0
            r0 = r9
            r1 = -1
            if (r0 != r1) goto L68
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Only fully qualified types are allowed (types in the default package cannot be added here either)"
            r1.<init>(r2)
            throw r0
        L68:
            r0 = r6
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r10 = r0
            r0 = r5
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.unqualifiedToQualifiedMap
            if (r0 != 0) goto L83
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "SingleType library"
            r1.<init>(r2)
            throw r0
        L83:
            r0 = r5
            r1 = r10
            java.lang.String r2 = "$"
            java.lang.String r3 = "."
            java.lang.String r1 = r1.replace(r2, r3)
            r2 = r8
            r0.put(r1, r2)
            r0 = r5
            r1 = r10
            r2 = r8
            r0.put(r1, r2)
            r0 = r5
            r1 = r6
            r2 = r8
            r0.put(r1, r2)
            r0 = r5
            r1 = r8
            r2 = r8
            r0.put(r1, r2)
            r0 = r6
            r1 = 36
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            int r0 = r0.indexOf(r1, r2)
            r11 = r0
            goto Lde
        Lb3:
            r0 = r6
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r12 = r0
            r0 = r5
            r1 = r12
            java.lang.String r2 = "$"
            java.lang.String r3 = "."
            java.lang.String r1 = r1.replace(r2, r3)
            r2 = r8
            r0.put(r1, r2)
            r0 = r5
            r1 = r12
            r2 = r8
            r0.put(r1, r2)
            r0 = r6
            r1 = 36
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            int r0 = r0.indexOf(r1, r2)
            r11 = r0
        Lde:
            r0 = r11
            r1 = -1
            if (r0 != r1) goto Lb3
            return
    }

    public java.util.List<java.lang.String> toQualifieds(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.unqualifiedToQualifiedMap
            if (r0 != 0) goto L27
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.unqualified
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.qualified
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
        L1d:
            r0 = r3
            java.lang.String r0 = r0.qualified
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L25:
            r0 = 0
            return r0
        L27:
            r0 = r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.unqualifiedToQualifiedMap
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L3a
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L3a:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L49
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L49:
            r0 = r5
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    private void put(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.unqualifiedToQualifiedMap
            r1 = r7
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L11
            return
        L11:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L35
            r0 = r9
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            return
        L21:
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r8
            r1[r2] = r3
            r10 = r0
            goto L58
        L35:
            r0 = r9
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r10 = r0
            r0 = r11
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r11
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r10
            r1 = r11
            int r1 = r1.length
            r2 = r8
            r0[r1] = r2
        L58:
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.unqualifiedToQualifiedMap
            r1 = r7
            r2 = r10
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }
}
