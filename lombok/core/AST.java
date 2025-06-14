package lombok.core;

import lombok.core.AST;
import lombok.core.LombokNode;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/AST.SCL.lombok */
public abstract class AST<A extends lombok.core.AST<A, L, N>, L extends lombok.core.LombokNode<A, L, N>, N> {
    private L top;
    private final java.lang.String fileName;
    private final java.lang.String packageDeclaration;
    private final lombok.core.ImportList imports;
    private lombok.core.TypeResolver importsAsResolver;
    java.util.Map<N, N> identityDetector;
    private java.util.Map<N, L> nodeMap;
    private boolean changed;
    private final java.util.Collection<java.lang.Class<? extends N>> statementTypes;
    private static final lombok.core.debug.HistogramTracker configTracker = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, lombok.core.AST.FieldAccess[]> fieldsOfASTClasses = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AST$FieldAccess.SCL.lombok */
    protected static class FieldAccess {
        public final java.lang.reflect.Field field;
        public final int dim;

        FieldAccess(java.lang.reflect.Field r4, int r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.field = r1
                r0 = r3
                r1 = r5
                r0.dim = r1
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AST$Kind.SCL.lombok */
    public enum Kind extends java.lang.Enum<lombok.core.AST.Kind> {
        public static final lombok.core.AST.Kind COMPILATION_UNIT = null;
        public static final lombok.core.AST.Kind TYPE = null;
        public static final lombok.core.AST.Kind FIELD = null;
        public static final lombok.core.AST.Kind INITIALIZER = null;
        public static final lombok.core.AST.Kind METHOD = null;
        public static final lombok.core.AST.Kind ANNOTATION = null;
        public static final lombok.core.AST.Kind ARGUMENT = null;
        public static final lombok.core.AST.Kind LOCAL = null;
        public static final lombok.core.AST.Kind STATEMENT = null;
        public static final lombok.core.AST.Kind TYPE_USE = null;
        private static final /* synthetic */ lombok.core.AST.Kind[] ENUM$VALUES = null;

        static {
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "COMPILATION_UNIT"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.COMPILATION_UNIT = r0
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "TYPE"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.TYPE = r0
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "FIELD"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.FIELD = r0
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "INITIALIZER"
                r3 = 3
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.INITIALIZER = r0
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "METHOD"
                r3 = 4
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.METHOD = r0
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "ANNOTATION"
                r3 = 5
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.ANNOTATION = r0
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "ARGUMENT"
                r3 = 6
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.ARGUMENT = r0
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "LOCAL"
                r3 = 7
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.LOCAL = r0
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "STATEMENT"
                r3 = 8
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.STATEMENT = r0
                lombok.core.AST$Kind r0 = new lombok.core.AST$Kind
                r1 = r0
                java.lang.String r2 = "TYPE_USE"
                r3 = 9
                r1.<init>(r2, r3)
                lombok.core.AST.Kind.TYPE_USE = r0
                r0 = 10
                lombok.core.AST$Kind[] r0 = new lombok.core.AST.Kind[r0]
                r1 = r0
                r2 = 0
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.COMPILATION_UNIT
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.TYPE
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.FIELD
                r1[r2] = r3
                r1 = r0
                r2 = 3
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.INITIALIZER
                r1[r2] = r3
                r1 = r0
                r2 = 4
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.METHOD
                r1[r2] = r3
                r1 = r0
                r2 = 5
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.ANNOTATION
                r1[r2] = r3
                r1 = r0
                r2 = 6
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.ARGUMENT
                r1[r2] = r3
                r1 = r0
                r2 = 7
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.LOCAL
                r1[r2] = r3
                r1 = r0
                r2 = 8
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.STATEMENT
                r1[r2] = r3
                r1 = r0
                r2 = 9
                lombok.core.AST$Kind r3 = lombok.core.AST.Kind.TYPE_USE
                r1[r2] = r3
                lombok.core.AST.Kind.ENUM$VALUES = r0
                return
        }

        Kind(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public static lombok.core.AST.Kind[] values() {
                lombok.core.AST$Kind[] r0 = lombok.core.AST.Kind.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.core.AST$Kind[] r2 = new lombok.core.AST.Kind[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.core.AST.Kind valueOf(java.lang.String r3) {
                java.lang.Class<lombok.core.AST$Kind> r0 = lombok.core.AST.Kind.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.core.AST$Kind r0 = (lombok.core.AST.Kind) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "lombok.timeConfig"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto Lc
            r0 = 0
            goto L15
        Lc:
            lombok.core.debug.HistogramTracker r0 = new lombok.core.debug.HistogramTracker
            r1 = r0
            java.lang.String r2 = "lombok.config"
            r1.<init>(r2)
        L15:
            lombok.core.AST.configTracker = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = r0
            r1.<init>()
            lombok.core.AST.fieldsOfASTClasses = r0
            return
    }

    protected AST(java.lang.String r5, java.lang.String r6, lombok.core.ImportList r7, java.util.Collection<java.lang.Class<? extends N>> r8) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r2 = r1
            r2.<init>()
            r0.identityDetector = r1
            r0 = r4
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r2 = r1
            r2.<init>()
            r0.nodeMap = r1
            r0 = r4
            r1 = 0
            r0.changed = r1
            r0 = r4
            r1 = r5
            if (r1 != 0) goto L29
            java.lang.String r1 = "(unknown).java"
            goto L2a
        L29:
            r1 = r5
        L2a:
            r0.fileName = r1
            r0 = r4
            r1 = r6
            r0.packageDeclaration = r1
            r0 = r4
            r1 = r7
            r0.imports = r1
            r0 = r4
            r1 = r8
            r0.statementTypes = r1
            return
    }

    public abstract java.net.URI getAbsoluteFileLocation();

    public void setChanged() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.changed = r1
            return
    }

    protected void clearChanged() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.changed = r1
            return
    }

    public boolean isChanged() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.changed
            return r0
    }

    protected void setTop(L r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.top = r1
            return
    }

    public final java.lang.String getPackageDeclaration() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.packageDeclaration
            return r0
    }

    public final lombok.core.ImportList getImportList() {
            r2 = this;
            r0 = r2
            lombok.core.ImportList r0 = r0.imports
            return r0
    }

    public final lombok.core.TypeResolver getImportListAsTypeResolver() {
            r5 = this;
            r0 = r5
            lombok.core.TypeResolver r0 = r0.importsAsResolver
            if (r0 == 0) goto Lc
            r0 = r5
            lombok.core.TypeResolver r0 = r0.importsAsResolver
            return r0
        Lc:
            r0 = r5
            lombok.core.TypeResolver r1 = new lombok.core.TypeResolver
            r2 = r1
            r3 = r5
            lombok.core.ImportList r3 = r3.getImportList()
            r2.<init>(r3)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.importsAsResolver = r2
            return r0
    }

    protected L putInMap(L r5) {
            r4 = this;
            r0 = r4
            java.util.Map<N, L extends lombok.core.LombokNode<A, L, N>> r0 = r0.nodeMap
            r1 = r5
            java.lang.Object r1 = r1.get()
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map<N, N> r0 = r0.identityDetector
            r1 = r5
            java.lang.Object r1 = r1.get()
            r2 = r5
            java.lang.Object r2 = r2.get()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    protected java.util.Map<N, L> getNodeMap() {
            r2 = this;
            r0 = r2
            java.util.Map<N, L extends lombok.core.LombokNode<A, L, N>> r0 = r0.nodeMap
            return r0
    }

    protected void clearState() {
            r4 = this;
            r0 = r4
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r2 = r1
            r2.<init>()
            r0.identityDetector = r1
            r0 = r4
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r2 = r1
            r2.<init>()
            r0.nodeMap = r1
            return
    }

    protected boolean setAndGetAsHandled(N r5) {
            r4 = this;
            r0 = r4
            java.util.Map<N, N> r0 = r0.identityDetector
            r1 = r5
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public java.lang.String getFileName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.fileName
            return r0
    }

    public L top() {
            r2 = this;
            r0 = r2
            L extends lombok.core.LombokNode<A, L, N> r0 = r0.top
            return r0
    }

    public L get(N r4) {
            r3 = this;
            r0 = r3
            java.util.Map<N, L extends lombok.core.LombokNode<A, L, N>> r0 = r0.nodeMap
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            return r0
    }

    public int getSourceVersion() {
            r2 = this;
            r0 = 6
            return r0
    }

    public int getLatestJavaSpecSupported() {
            r2 = this;
            r0 = 6
            return r0
    }

    L replaceNewWithExistingOld(java.util.Map<N, L> r5, L r6) {
            r4 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r1 = r1.get()
            java.lang.Object r0 = r0.get(r1)
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L16
            r0 = r6
            goto L17
        L16:
            r0 = r7
        L17:
            r8 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r6
            lombok.core.LombokImmutableList<L extends lombok.core.LombokNode<A, L, N>> r0 = r0.children
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L54
        L2e:
            r0 = r11
            java.lang.Object r0 = r0.next()
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r10 = r0
            r0 = r4
            r1 = r5
            r2 = r10
            lombok.core.LombokNode r0 = r0.replaceNewWithExistingOld(r1, r2)
            r12 = r0
            r0 = r9
            r1 = r12
            boolean r0 = r0.add(r1)
            r0 = r12
            r1 = r8
            r0.parent = r1
        L54:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2e
            r0 = r8
            r1 = r9
            lombok.core.LombokImmutableList r1 = lombok.core.LombokImmutableList.copyOf(r1)
            r0.children = r1
            r0 = r8
            return r0
    }

    protected abstract L buildTree(N r1, lombok.core.AST.Kind r2);

    protected lombok.core.AST.FieldAccess[] fieldsOf(java.lang.Class<?> r6) {
            r5 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, lombok.core.AST$FieldAccess[]> r0 = lombok.core.AST.fieldsOfASTClasses
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AST$FieldAccess[] r0 = (lombok.core.AST.FieldAccess[]) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L13
            r0 = r7
            return r0
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            r0.getFields(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, lombok.core.AST$FieldAccess[]> r0 = lombok.core.AST.fieldsOfASTClasses
            r1 = r6
            r2 = r8
            r3 = 0
            lombok.core.AST$FieldAccess[] r3 = new lombok.core.AST.FieldAccess[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            lombok.core.AST$FieldAccess[] r2 = (lombok.core.AST.FieldAccess[]) r2
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, lombok.core.AST$FieldAccess[]> r0 = lombok.core.AST.fieldsOfASTClasses
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            lombok.core.AST$FieldAccess[] r0 = (lombok.core.AST.FieldAccess[]) r0
            return r0
    }

    private void getFields(java.lang.Class<?> r7, java.util.Collection<lombok.core.AST.FieldAccess> r8) {
            r6 = this;
            r0 = r7
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto La
            r0 = r7
            if (r0 != 0) goto Lb
        La:
            return
        Lb:
            r0 = r7
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L95
        L1b:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L2e
            goto L92
        L2e:
            r0 = r9
            java.lang.Class r0 = r0.getType()
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r13
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L64
            goto L4c
        L42:
            int r14 = r14 + 1
            r0 = r13
            java.lang.Class r0 = r0.getComponentType()
            r13 = r0
        L4c:
            r0 = r13
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L42
            goto L6e
        L57:
            int r14 = r14 + 1
            r0 = r6
            r1 = r9
            java.lang.reflect.Type r1 = r1.getGenericType()
            java.lang.Class r0 = r0.getComponentType(r1)
            r13 = r0
        L64:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            r1 = r13
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L57
        L6e:
            r0 = r6
            r1 = r7
            r2 = r13
            r3 = r9
            java.lang.String r3 = r3.getName()
            boolean r0 = r0.shouldDrill(r1, r2, r3)
            if (r0 == 0) goto L92
            r0 = r9
            java.lang.reflect.AccessibleObject r0 = lombok.permit.Permit.setAccessible(r0)
            r0 = r8
            lombok.core.AST$FieldAccess r1 = new lombok.core.AST$FieldAccess
            r2 = r1
            r3 = r9
            r4 = r14
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
        L92:
            int r10 = r10 + 1
        L95:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L1b
            r0 = r6
            r1 = r7
            java.lang.Class r1 = r1.getSuperclass()
            r2 = r8
            r0.getFields(r1, r2)
            return
    }

    private java.lang.Class<?> getComponentType(java.lang.reflect.Type r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L24
            r0 = r4
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L21
            r0 = r5
            java.lang.Class r0 = (java.lang.Class) r0
            goto L23
        L21:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L23:
            return r0
        L24:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            return r0
    }

    private boolean shouldDrill(java.lang.Class<?> r4, java.lang.Class<?> r5, java.lang.String r6) {
            r3 = this;
            r0 = r3
            java.util.Collection<java.lang.Class<? extends N>> r0 = r0.statementTypes
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L25
        Le:
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.lang.Class r0 = (java.lang.Class) r0
            r7 = r0
            r0 = r7
            r1 = r5
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L25
            r0 = 1
            return r0
        L25:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            r0 = 0
            return r0
    }

    protected java.util.Collection<L> buildWithField(java.lang.Class<L> r7, N r8, lombok.core.AST.FieldAccess r9) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.buildWithField0(r1, r2, r3, r4)
            r0 = r10
            return r0
    }

    protected boolean replaceStatementInNode(N r7, N r8, N r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            java.lang.Class r1 = r1.getClass()
            lombok.core.AST$FieldAccess[] r0 = r0.fieldsOf(r1)
            r1 = r0
            r13 = r1
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r11 = r0
            goto L2c
        L14:
            r0 = r13
            r1 = r11
            r0 = r0[r1]
            r10 = r0
            r0 = r6
            r1 = r10
            r2 = r7
            r3 = r8
            r4 = r9
            boolean r0 = r0.replaceStatementInField(r1, r2, r3, r4)
            if (r0 == 0) goto L29
            r0 = 1
            return r0
        L29:
            int r11 = r11 + 1
        L2c:
            r0 = r11
            r1 = r12
            if (r0 < r1) goto L14
            r0 = 0
            return r0
    }

    private boolean replaceStatementInField(lombok.core.AST.FieldAccess r9, N r10, N r11, N r12) {
            r8 = this;
            r0 = r9
            java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.IllegalAccessException -> L64
            r1 = r10
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L64
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            r0 = r13
            r1 = r11
            if (r0 != r1) goto L23
            r0 = r9
            java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.IllegalAccessException -> L64
            r1 = r10
            r2 = r12
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> L64
            r0 = 1
            return r0
        L23:
            r0 = r9
            int r0 = r0.dim     // Catch: java.lang.IllegalAccessException -> L64
            if (r0 <= 0) goto L62
            r0 = r13
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L64
            boolean r0 = r0.isArray()     // Catch: java.lang.IllegalAccessException -> L64
            if (r0 == 0) goto L3f
            r0 = r8
            r1 = r13
            r2 = r11
            r3 = r12
            boolean r0 = r0.replaceStatementInArray(r1, r2, r3)     // Catch: java.lang.IllegalAccessException -> L64
            return r0
        L3f:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            r1 = r13
            boolean r0 = r0.isInstance(r1)     // Catch: java.lang.IllegalAccessException -> L64
            if (r0 == 0) goto L62
            r0 = r8
            r1 = r9
            java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.IllegalAccessException -> L64
            r2 = r10
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.IllegalAccessException -> L64
            r4 = r3
            r4.<init>()     // Catch: java.lang.IllegalAccessException -> L64
            r4 = r13
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.IllegalAccessException -> L64
            r5 = r11
            r6 = r12
            boolean r0 = r0.replaceStatementInCollection(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.IllegalAccessException -> L64
            return r0
        L62:
            r0 = 0
            return r0
        L64:
            r13 = move-exception
            r0 = r13
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
    }

    private boolean replaceStatementInCollection(java.lang.reflect.Field r9, java.lang.Object r10, java.util.List<java.util.Collection<?>> r11, java.util.Collection<?> r12, N r13, N r14) throws java.lang.IllegalAccessException {
            r8 = this;
            r0 = r12
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            r0 = -1
            r15 = r0
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L78
        L16:
            r0 = r17
            java.lang.Object r0 = r0.next()
            r16 = r0
            int r15 = r15 + 1
            r0 = r16
            if (r0 != 0) goto L2a
            goto L78
        L2a:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            r1 = r16
            boolean r0 = r0.isInstance(r1)
            if (r0 == 0) goto L62
            r0 = r16
            java.util.Collection r0 = (java.util.Collection) r0
            r18 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r19 = r0
            r0 = r19
            r1 = r18
            boolean r0 = r0.add(r1)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r19
            r4 = r18
            r5 = r13
            r6 = r14
            boolean r0 = r0.replaceStatementInCollection(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L62
            r0 = 1
            return r0
        L62:
            r0 = r16
            r1 = r13
            if (r0 != r1) goto L78
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r15
            r6 = r14
            r0.setElementInASTCollection(r1, r2, r3, r4, r5, r6)
            r0 = 1
            return r0
        L78:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L16
            r0 = 0
            return r0
    }

    protected void setElementInASTCollection(java.lang.reflect.Field r5, java.lang.Object r6, java.util.List<java.util.Collection<?>> r7, java.util.Collection<?> r8, int r9, N r10) throws java.lang.IllegalAccessException {
            r4 = this;
            r0 = r8
            boolean r0 = r0 instanceof java.util.List
            if (r0 == 0) goto L17
            r0 = r8
            java.util.List r0 = (java.util.List) r0
            r1 = r9
            r2 = r10
            java.lang.Object r0 = r0.set(r1, r2)
        L17:
            return
    }

    private boolean replaceStatementInArray(java.lang.Object r6, N r7, N r8) {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r6
            int r0 = java.lang.reflect.Array.getLength(r0)
            r9 = r0
            r0 = 0
            r10 = r0
            goto L4c
        L12:
            r0 = r6
            r1 = r10
            java.lang.Object r0 = java.lang.reflect.Array.get(r0, r1)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L22
            goto L49
        L22:
            r0 = r11
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L3a
            r0 = r5
            r1 = r11
            r2 = r7
            r3 = r8
            boolean r0 = r0.replaceStatementInArray(r1, r2, r3)
            if (r0 == 0) goto L49
            r0 = 1
            return r0
        L3a:
            r0 = r11
            r1 = r7
            if (r0 != r1) goto L49
            r0 = r6
            r1 = r10
            r2 = r8
            java.lang.reflect.Array.set(r0, r1, r2)
            r0 = 1
            return r0
        L49:
            int r10 = r10 + 1
        L4c:
            r0 = r10
            r1 = r9
            if (r0 < r1) goto L12
            r0 = 0
            return r0
    }

    private void buildWithField0(java.lang.Class<L> r7, N r8, lombok.core.AST.FieldAccess r9, java.util.Collection<L> r10) {
            r6 = this;
            r0 = r9
            java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.IllegalAccessException -> L70
            r1 = r8
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L70
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L10
            return
        L10:
            r0 = r9
            int r0 = r0.dim     // Catch: java.lang.IllegalAccessException -> L70
            if (r0 != 0) goto L3b
            r0 = r6
            r1 = r11
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.STATEMENT     // Catch: java.lang.IllegalAccessException -> L70
            lombok.core.LombokNode r0 = r0.buildTree(r1, r2)     // Catch: java.lang.IllegalAccessException -> L70
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L78
            r0 = r10
            r1 = r7
            r2 = r12
            java.lang.Object r1 = r1.cast(r2)     // Catch: java.lang.IllegalAccessException -> L70
            lombok.core.LombokNode r1 = (lombok.core.LombokNode) r1     // Catch: java.lang.IllegalAccessException -> L70
            boolean r0 = r0.add(r1)     // Catch: java.lang.IllegalAccessException -> L70
            goto L78
        L3b:
            r0 = r11
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L70
            boolean r0 = r0.isArray()     // Catch: java.lang.IllegalAccessException -> L70
            if (r0 == 0) goto L56
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = r10
            r4 = r9
            int r4 = r4.dim     // Catch: java.lang.IllegalAccessException -> L70
            r0.buildWithArray(r1, r2, r3, r4)     // Catch: java.lang.IllegalAccessException -> L70
            goto L78
        L56:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            r1 = r11
            boolean r0 = r0.isInstance(r1)     // Catch: java.lang.IllegalAccessException -> L70
            if (r0 == 0) goto L78
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = r10
            r4 = r9
            int r4 = r4.dim     // Catch: java.lang.IllegalAccessException -> L70
            r0.buildWithCollection(r1, r2, r3, r4)     // Catch: java.lang.IllegalAccessException -> L70
            goto L78
        L70:
            r11 = move-exception
            r0 = r11
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L78:
            return
    }

    private void buildWithArray(java.lang.Class<L> r8, java.lang.Object r9, java.util.Collection<L> r10, int r11) {
            r7 = this;
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L52
            r0 = r9
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0
            r15 = r1
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r13 = r0
            goto L48
        L16:
            r0 = r15
            r1 = r13
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L25
            goto L45
        L25:
            r0 = r7
            r1 = r12
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.STATEMENT
            lombok.core.LombokNode r0 = r0.buildTree(r1, r2)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L45
            r0 = r10
            r1 = r8
            r2 = r16
            java.lang.Object r1 = r1.cast(r2)
            lombok.core.LombokNode r1 = (lombok.core.LombokNode) r1
            boolean r0 = r0.add(r1)
        L45:
            int r13 = r13 + 1
        L48:
            r0 = r13
            r1 = r14
            if (r0 < r1) goto L16
            goto L85
        L52:
            r0 = r9
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0
            r15 = r1
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r13 = r0
            goto L7e
        L62:
            r0 = r15
            r1 = r13
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L6f
            return
        L6f:
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r10
            r4 = r11
            r5 = 1
            int r4 = r4 - r5
            r0.buildWithArray(r1, r2, r3, r4)
            int r13 = r13 + 1
        L7e:
            r0 = r13
            r1 = r14
            if (r0 < r1) goto L62
        L85:
            return
    }

    private void buildWithCollection(java.lang.Class<L> r8, java.lang.Object r9, java.util.Collection<L> r10, int r11) {
            r7 = this;
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L52
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L45
        L14:
            r0 = r13
            java.lang.Object r0 = r0.next()
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L25
            goto L45
        L25:
            r0 = r7
            r1 = r12
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.STATEMENT
            lombok.core.LombokNode r0 = r0.buildTree(r1, r2)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L45
            r0 = r10
            r1 = r8
            r2 = r14
            java.lang.Object r1 = r1.cast(r2)
            lombok.core.LombokNode r1 = (lombok.core.LombokNode) r1
            boolean r0 = r0.add(r1)
        L45:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            goto L7f
        L52:
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L75
        L60:
            r0 = r13
            java.lang.Object r0 = r0.next()
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r10
            r4 = r11
            r5 = 1
            int r4 = r4 - r5
            r0.buildWithCollection(r1, r2, r3, r4)
        L75:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L60
        L7f:
            return
    }

    public final <T> T readConfiguration(lombok.core.configuration.ConfigurationKey<T> r5) {
            r4 = this;
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            if (r0 != 0) goto La
            r0 = 0
            goto L10
        La:
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            long r0 = r0.start()
        L10:
            r6 = r0
            r0 = r5
            r1 = r4
            java.lang.Object r0 = lombok.core.LombokConfiguration.read(r0, r1)     // Catch: java.lang.Throwable -> L28
            r9 = r0
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L25
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            r1 = r6
            r0.end(r1)
        L25:
            r0 = r9
            return r0
        L28:
            r8 = move-exception
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            if (r0 == 0) goto L37
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            r1 = r6
            r0.end(r1)
        L37:
            r0 = r8
            throw r0
    }

    public final <T> T readConfigurationOr(lombok.core.configuration.ConfigurationKey<T> r5, T r6) {
            r4 = this;
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            if (r0 != 0) goto La
            r0 = 0
            goto L10
        La:
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            long r0 = r0.start()
        L10:
            r7 = r0
            r0 = r5
            r1 = r4
            java.lang.Object r0 = lombok.core.LombokConfiguration.read(r0, r1)     // Catch: java.lang.Throwable -> L35
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L22
            r0 = r9
            goto L23
        L22:
            r0 = r6
        L23:
            r11 = r0
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L32
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            r1 = r7
            r0.end(r1)
        L32:
            r0 = r11
            return r0
        L35:
            r10 = move-exception
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            if (r0 == 0) goto L44
            lombok.core.debug.HistogramTracker r0 = lombok.core.AST.configTracker
            r1 = r7
            r0.end(r1)
        L44:
            r0 = r10
            throw r0
    }

    public boolean getBooleanAnnotationValue(lombok.core.AnnotationValues<?> r4, java.lang.String r5, lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r6) {
            r3 = this;
            r0 = r3
            r1 = r6
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r7 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L17
            r0 = r7
            if (r0 != 0) goto L1f
        L17:
            r0 = r4
            r1 = r5
            boolean r0 = r0.getAsBoolean(r1)
            goto L24
        L1f:
            r0 = r7
            boolean r0 = r0.booleanValue()
        L24:
            return r0
    }
}
