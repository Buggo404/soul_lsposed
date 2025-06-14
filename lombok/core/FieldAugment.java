package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/FieldAugment.SCL.lombok */
public abstract class FieldAugment<T, F> {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/FieldAugment$InterfaceFieldAugment.SCL.lombok */
    private static final class InterfaceFieldAugment<T, F> extends lombok.core.FieldAugment<T, F> {
        private final java.lang.String name;
        private final java.lang.Class<? super F> fieldType;
        private java.util.Map<java.lang.Class<T>, lombok.core.FieldAugment<T, F>> map;

        private InterfaceFieldAugment(java.lang.String r5, java.lang.Class<? super F> r6) {
                r4 = this;
                r0 = r4
                r1 = 0
                r0.<init>(r1)
                r0 = r4
                java.util.HashMap r1 = new java.util.HashMap
                r2 = r1
                r2.<init>()
                r0.map = r1
                r0 = r4
                r1 = r5
                r0.name = r1
                r0 = r4
                r1 = r6
                r0.fieldType = r1
                return
        }

        private synchronized lombok.core.FieldAugment<T, F> getDelegate(T r5) {
                r4 = this;
                r0 = r5
                java.lang.Class r0 = r0.getClass()
                r6 = r0
                r0 = r4
                java.util.Map<java.lang.Class<T>, lombok.core.FieldAugment<T, F>> r0 = r0.map
                r1 = r6
                java.lang.Object r0 = r0.get(r1)
                lombok.core.FieldAugment r0 = (lombok.core.FieldAugment) r0
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L30
                r0 = r6
                r1 = r4
                java.lang.Class<? super F> r1 = r1.fieldType
                r2 = r4
                java.lang.String r2 = r2.name
                lombok.core.FieldAugment r0 = augment(r0, r1, r2)
                r7 = r0
                r0 = r4
                java.util.Map<java.lang.Class<T>, lombok.core.FieldAugment<T, F>> r0 = r0.map
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.put(r1, r2)
            L30:
                r0 = r7
                return r0
        }

        @Override // lombok.core.FieldAugment
        public F get(T r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                lombok.core.FieldAugment r0 = r0.getDelegate(r1)
                r1 = r4
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        @Override // lombok.core.FieldAugment
        public F getAndSet(T r5, F r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                lombok.core.FieldAugment r0 = r0.getDelegate(r1)
                r1 = r5
                r2 = r6
                java.lang.Object r0 = r0.getAndSet(r1, r2)
                return r0
        }

        @Override // lombok.core.FieldAugment
        public F clear(T r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                lombok.core.FieldAugment r0 = r0.getDelegate(r1)
                r1 = r4
                java.lang.Object r0 = r0.clear(r1)
                return r0
        }

        @Override // lombok.core.FieldAugment
        public F compareAndClear(T r5, F r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                lombok.core.FieldAugment r0 = r0.getDelegate(r1)
                r1 = r5
                r2 = r6
                java.lang.Object r0 = r0.compareAndClear(r1, r2)
                return r0
        }

        @Override // lombok.core.FieldAugment
        public F setIfAbsent(T r5, F r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                lombok.core.FieldAugment r0 = r0.getDelegate(r1)
                r1 = r5
                r2 = r6
                java.lang.Object r0 = r0.setIfAbsent(r1, r2)
                return r0
        }

        @Override // lombok.core.FieldAugment
        public F compareAndSet(T r6, F r7, F r8) {
                r5 = this;
                r0 = r5
                r1 = r6
                lombok.core.FieldAugment r0 = r0.getDelegate(r1)
                r1 = r6
                r2 = r7
                r3 = r8
                java.lang.Object r0 = r0.compareAndSet(r1, r2, r3)
                return r0
        }

        /* synthetic */ InterfaceFieldAugment(java.lang.String r5, java.lang.Class r6, lombok.core.FieldAugment.InterfaceFieldAugment r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/FieldAugment$MapFieldAugment.SCL.lombok */
    private static class MapFieldAugment<T, F> extends lombok.core.FieldAugment<T, F> {
        final java.util.Map<T, java.lang.Object> values;
        final F defaultValue;

        MapFieldAugment(F r5) {
                r4 = this;
                r0 = r4
                r1 = 0
                r0.<init>(r1)
                r0 = r4
                java.util.WeakHashMap r1 = new java.util.WeakHashMap
                r2 = r1
                r2.<init>()
                r0.values = r1
                r0 = r4
                r1 = r5
                r0.defaultValue = r1
                return
        }

        @Override // lombok.core.FieldAugment
        public F get(T r4) {
                r3 = this;
                r0 = r4
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r3
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r0
                r5 = r1
                monitor-enter(r0)
                r0 = r3
                r1 = r4
                java.lang.Object r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L16
                r1 = r5
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
                return r0
            L16:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
                throw r0     // Catch: java.lang.Throwable -> L16
        }

        @Override // lombok.core.FieldAugment
        public F getAndSet(T r5, F r6) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r6
                java.lang.String r1 = "value"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r4
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r0
                r7 = r1
                monitor-enter(r0)
                r0 = r4
                r1 = r5
                java.lang.Object r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L27
                r8 = r0
                r0 = r4
                r1 = r5
                r2 = r6
                r0.write(r1, r2)     // Catch: java.lang.Throwable -> L27
                r0 = r8
                r1 = r7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
                return r0
            L27:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
                throw r0     // Catch: java.lang.Throwable -> L27
        }

        @Override // lombok.core.FieldAugment
        public F clear(T r4) {
                r3 = this;
                r0 = r4
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r3
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r0
                r5 = r1
                monitor-enter(r0)
                r0 = r3
                r1 = r4
                java.lang.Object r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L23
                r6 = r0
                r0 = r3
                java.util.Map<T, java.lang.Object> r0 = r0.values     // Catch: java.lang.Throwable -> L23
                r1 = r4
                java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L23
                r0 = r6
                r1 = r5
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
                return r0
            L23:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
                throw r0     // Catch: java.lang.Throwable -> L23
        }

        @Override // lombok.core.FieldAugment
        public F compareAndClear(T r4, F r5) {
                r3 = this;
                r0 = r4
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r5
                java.lang.String r1 = "expected"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r3
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r0
                r6 = r1
                monitor-enter(r0)
                r0 = r3
                r1 = r4
                java.lang.Object r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L42
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L25
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                r0 = 0
                return r0
            L25:
                r0 = r5
                r1 = r7
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L42
                if (r0 != 0) goto L33
                r0 = r7
                r1 = r6
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
                return r0
            L33:
                r0 = r3
                java.util.Map<T, java.lang.Object> r0 = r0.values     // Catch: java.lang.Throwable -> L42
                r1 = r4
                java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L42
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                r0 = 0
                return r0
            L42:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
                throw r0     // Catch: java.lang.Throwable -> L42
        }

        @Override // lombok.core.FieldAugment
        public F setIfAbsent(T r5, F r6) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r6
                java.lang.String r1 = "value"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r4
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r0
                r7 = r1
                monitor-enter(r0)
                r0 = r4
                r1 = r5
                java.lang.Object r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L30
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L26
                r0 = r8
                r1 = r7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
                return r0
            L26:
                r0 = r4
                r1 = r5
                r2 = r6
                r0.write(r1, r2)     // Catch: java.lang.Throwable -> L30
                r0 = r6
                r1 = r7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
                return r0
            L30:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
                throw r0     // Catch: java.lang.Throwable -> L30
        }

        @Override // lombok.core.FieldAugment
        public F compareAndSet(T r5, F r6, F r7) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r6
                java.lang.String r1 = "expected"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r7
                java.lang.String r1 = "value"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r4
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r0
                r8 = r1
                monitor-enter(r0)
                r0 = r4
                r1 = r5
                java.lang.Object r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L3e
                r9 = r0
                r0 = r6
                r1 = r9
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L3e
                if (r0 != 0) goto L33
                r0 = r9
                r1 = r8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
                return r0
            L33:
                r0 = r4
                r1 = r5
                r2 = r7
                r0.write(r1, r2)     // Catch: java.lang.Throwable -> L3e
                r0 = r7
                r1 = r8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
                return r0
            L3e:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
                throw r0     // Catch: java.lang.Throwable -> L3e
        }

        F read(T r4) {
                r3 = this;
                r0 = r3
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r4
                java.lang.Object r0 = r0.get(r1)
                r5 = r0
                r0 = r5
                if (r0 != 0) goto L16
                r0 = r3
                F r0 = r0.defaultValue
                goto L17
            L16:
                r0 = r5
            L17:
                return r0
        }

        void write(T r5, F r6) {
                r4 = this;
                r0 = r4
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r5
                r2 = r6
                java.lang.Object r0 = r0.put(r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/FieldAugment$MapWeakFieldAugment.SCL.lombok */
    static class MapWeakFieldAugment<T, F> extends lombok.core.FieldAugment.MapFieldAugment<T, F> {
        MapWeakFieldAugment(F r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }

        @Override // lombok.core.FieldAugment.MapFieldAugment
        F read(T r4) {
                r3 = this;
                r0 = r3
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r4
                java.lang.Object r0 = r0.get(r1)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                r5 = r0
                r0 = r5
                if (r0 != 0) goto L17
                r0 = r3
                F r0 = r0.defaultValue
                return r0
            L17:
                r0 = r5
                java.lang.Object r0 = r0.get()
                r6 = r0
                r0 = r6
                if (r0 != 0) goto L2b
                r0 = r3
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r4
                java.lang.Object r0 = r0.remove(r1)
            L2b:
                r0 = r6
                if (r0 != 0) goto L36
                r0 = r3
                F r0 = r0.defaultValue
                goto L37
            L36:
                r0 = r6
            L37:
                return r0
        }

        @Override // lombok.core.FieldAugment.MapFieldAugment
        void write(T r7, F r8) {
                r6 = this;
                r0 = r6
                java.util.Map<T, java.lang.Object> r0 = r0.values
                r1 = r7
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r3 = r2
                r4 = r8
                r3.<init>(r4)
                java.lang.Object r0 = r0.put(r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/FieldAugment$ReflectionFieldAugment.SCL.lombok */
    private static class ReflectionFieldAugment<T, F> extends lombok.core.FieldAugment<T, F> {
        private final java.lang.Object lock;
        private final java.lang.reflect.Field field;
        private final java.lang.Class<F> targetType;
        private final F defaultValue;

        ReflectionFieldAugment(java.lang.reflect.Field r5, java.lang.Class<? super F> r6, F r7) {
                r4 = this;
                r0 = r4
                r1 = 0
                r0.<init>(r1)
                r0 = r4
                java.lang.Object r1 = new java.lang.Object
                r2 = r1
                r2.<init>()
                r0.lock = r1
                r0 = r4
                r1 = r5
                r0.field = r1
                r0 = r4
                r1 = r6
                r0.targetType = r1
                r0 = r4
                r1 = r7
                r0.defaultValue = r1
                return
        }

        @Override // lombok.core.FieldAugment
        public F get(T r5) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r4
                java.lang.Object r0 = r0.lock     // Catch: java.lang.IllegalAccessException -> L33
                r1 = r0
                r7 = r1
                monitor-enter(r0)     // Catch: java.lang.IllegalAccessException -> L33
                r0 = r4
                java.lang.Class<F> r0 = r0.targetType     // Catch: java.lang.Throwable -> L23 java.lang.IllegalAccessException -> L33
                r1 = r4
                java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.Throwable -> L23 java.lang.IllegalAccessException -> L33
                r2 = r5
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalAccessException -> L33
                java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalAccessException -> L33
                r6 = r0
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalAccessException -> L33
                goto L26
            L23:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalAccessException -> L33
                throw r0     // Catch: java.lang.Throwable -> L23 java.lang.IllegalAccessException -> L33
            L26:
                r0 = r6
                if (r0 != 0) goto L31
                r0 = r4
                F r0 = r0.defaultValue     // Catch: java.lang.IllegalAccessException -> L33
                goto L32
            L31:
                r0 = r6
            L32:
                return r0
            L33:
                r6 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r2 = r6
                r1.<init>(r2)
                throw r0
        }

        @Override // lombok.core.FieldAugment
        public F getAndSet(T r5, F r6) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r6
                java.lang.String r1 = "value"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r4
                java.lang.Object r0 = r0.lock     // Catch: java.lang.IllegalAccessException -> L46
                r1 = r0
                r8 = r1
                monitor-enter(r0)     // Catch: java.lang.IllegalAccessException -> L46
                r0 = r4
                java.lang.Class<F> r0 = r0.targetType     // Catch: java.lang.Throwable -> L35 java.lang.IllegalAccessException -> L46
                r1 = r4
                java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.Throwable -> L35 java.lang.IllegalAccessException -> L46
                r2 = r5
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalAccessException -> L46
                java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalAccessException -> L46
                r7 = r0
                r0 = r4
                java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.Throwable -> L35 java.lang.IllegalAccessException -> L46
                r1 = r5
                r2 = r6
                r0.set(r1, r2)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalAccessException -> L46
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalAccessException -> L46
                goto L39
            L35:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalAccessException -> L46
                throw r0     // Catch: java.lang.Throwable -> L35 java.lang.IllegalAccessException -> L46
            L39:
                r0 = r7
                if (r0 != 0) goto L44
                r0 = r4
                F r0 = r0.defaultValue     // Catch: java.lang.IllegalAccessException -> L46
                goto L45
            L44:
                r0 = r7
            L45:
                return r0
            L46:
                r7 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r2 = r7
                r1.<init>(r2)
                throw r0
        }

        @Override // lombok.core.FieldAugment
        public F clear(T r5) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r4
                java.lang.Object r0 = r0.lock     // Catch: java.lang.IllegalAccessException -> L3f
                r1 = r0
                r7 = r1
                monitor-enter(r0)     // Catch: java.lang.IllegalAccessException -> L3f
                r0 = r4
                java.lang.Class<F> r0 = r0.targetType     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
                r1 = r4
                java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
                r2 = r5
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
                java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
                r6 = r0
                r0 = r4
                java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
                r1 = r5
                r2 = r4
                F r2 = r2.defaultValue     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
                r0.set(r1, r2)     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
                goto L32
            L2f:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
                throw r0     // Catch: java.lang.Throwable -> L2f java.lang.IllegalAccessException -> L3f
            L32:
                r0 = r6
                if (r0 != 0) goto L3d
                r0 = r4
                F r0 = r0.defaultValue     // Catch: java.lang.IllegalAccessException -> L3f
                goto L3e
            L3d:
                r0 = r6
            L3e:
                return r0
            L3f:
                r6 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r2 = r6
                r1.<init>(r2)
                throw r0
        }

        @Override // lombok.core.FieldAugment
        public F compareAndClear(T r5, F r6) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r6
                java.lang.String r1 = "expected"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r4
                java.lang.Object r0 = r0.lock     // Catch: java.lang.IllegalAccessException -> L4e
                r1 = r0
                r8 = r1
                monitor-enter(r0)     // Catch: java.lang.IllegalAccessException -> L4e
                r0 = r4
                java.lang.Class<F> r0 = r0.targetType     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                r1 = r4
                java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                r2 = r5
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                r7 = r0
                r0 = r6
                r1 = r7
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                if (r0 == 0) goto L42
                r0 = r4
                java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                r1 = r5
                r2 = r4
                F r2 = r2.defaultValue     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                r0.set(r1, r2)     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                r0 = r4
                F r0 = r0.defaultValue     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                r1 = r8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                return r0
            L42:
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                goto L4c
            L48:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
                throw r0     // Catch: java.lang.Throwable -> L48 java.lang.IllegalAccessException -> L4e
            L4c:
                r0 = r7
                return r0
            L4e:
                r7 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r2 = r7
                r1.<init>(r2)
                throw r0
        }

        @Override // lombok.core.FieldAugment
        public F setIfAbsent(T r5, F r6) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r6
                java.lang.String r1 = "value"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r4
                java.lang.Object r0 = r0.lock     // Catch: java.lang.IllegalAccessException -> L4c
                r1 = r0
                r7 = r1
                monitor-enter(r0)     // Catch: java.lang.IllegalAccessException -> L4c
                r0 = r4
                java.lang.Class<F> r0 = r0.targetType     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                r1 = r4
                java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                r2 = r5
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L3c
                r0 = r8
                r1 = r4
                F r1 = r1.defaultValue     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                if (r0 != 0) goto L3c
                r0 = r8
                r1 = r7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                return r0
            L3c:
                r0 = r4
                java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                r1 = r5
                r2 = r6
                r0.set(r1, r2)     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                r0 = r6
                r1 = r7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                return r0
            L49:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
                throw r0     // Catch: java.lang.Throwable -> L49 java.lang.IllegalAccessException -> L4c
            L4c:
                r7 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r2 = r7
                r1.<init>(r2)
                throw r0
        }

        @Override // lombok.core.FieldAugment
        public F compareAndSet(T r5, F r6, F r7) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "object"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r6
                java.lang.String r1 = "expected"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r7
                java.lang.String r1 = "value"
                java.lang.Object r0 = lombok.core.FieldAugment.access$1(r0, r1)
                r0 = r4
                java.lang.Object r0 = r0.lock     // Catch: java.lang.IllegalAccessException -> L5b
                r1 = r0
                r8 = r1
                monitor-enter(r0)     // Catch: java.lang.IllegalAccessException -> L5b
                r0 = r4
                java.lang.Class<F> r0 = r0.targetType     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                r1 = r4
                java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                r2 = r5
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                r9 = r0
                r0 = r6
                r1 = r9
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                if (r0 != 0) goto L49
                r0 = r9
                if (r0 != 0) goto L43
                r0 = r4
                F r0 = r0.defaultValue     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                goto L45
            L43:
                r0 = r9
            L45:
                r1 = r8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                return r0
            L49:
                r0 = r4
                java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                r1 = r5
                r2 = r7
                r0.set(r1, r2)     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                r0 = r7
                r1 = r8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                return r0
            L57:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
                throw r0     // Catch: java.lang.Throwable -> L57 java.lang.IllegalAccessException -> L5b
            L5b:
                r8 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r2 = r8
                r1.<init>(r2)
                throw r0
        }
    }

    private static java.lang.Object getDefaultValue(java.lang.Class<?> r3) {
            r0 = r3
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto Lc
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lc:
            r0 = r3
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L18
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L18:
            r0 = r3
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L2d
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L2d:
            r0 = r3
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L39
            r0 = 0
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
        L39:
            r0 = r3
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L45
            r0 = 0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L45:
            r0 = r3
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L51
            r0 = 0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L51:
            r0 = r3
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L5d
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L5d:
            r0 = r3
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L69
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L69:
            r0 = 0
            return r0
    }

    public static <T, F> lombok.core.FieldAugment<T, F> augment(java.lang.Class<T> r6, java.lang.Class<? super F> r7, java.lang.String r8) {
            r0 = r6
            java.lang.String r1 = "type"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r7
            java.lang.String r1 = "fieldType"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r8
            java.lang.String r1 = "name"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r6
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L27
            lombok.core.FieldAugment$InterfaceFieldAugment r0 = new lombok.core.FieldAugment$InterfaceFieldAugment
            r1 = r0
            r2 = r8
            r3 = r7
            r4 = 0
            r1.<init>(r2, r3, r4)
            return r0
        L27:
            r0 = r7
            java.lang.Object r0 = getDefaultValue(r0)
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            lombok.core.FieldAugment r0 = tryCreateReflectionAugment(r0, r1, r2, r3)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L3f
            r0 = r10
            goto L47
        L3f:
            lombok.core.FieldAugment$MapFieldAugment r0 = new lombok.core.FieldAugment$MapFieldAugment
            r1 = r0
            r2 = r9
            r1.<init>(r2)
        L47:
            return r0
    }

    public static <T, F> lombok.core.FieldAugment<T, F> circularSafeAugment(java.lang.Class<T> r5, java.lang.Class<? super F> r6, java.lang.String r7) {
            r0 = r5
            java.lang.String r1 = "type"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r6
            java.lang.String r1 = "fieldType"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r7
            java.lang.String r1 = "name"
            java.lang.Object r0 = checkNotNull(r0, r1)
            r0 = r6
            java.lang.Object r0 = getDefaultValue(r0)
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            lombok.core.FieldAugment r0 = tryCreateReflectionAugment(r0, r1, r2, r3)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L2d
            r0 = r9
            goto L35
        L2d:
            lombok.core.FieldAugment$MapWeakFieldAugment r0 = new lombok.core.FieldAugment$MapWeakFieldAugment
            r1 = r0
            r2 = r8
            r1.<init>(r2)
        L35:
            return r0
    }

    private static <T, F> lombok.core.FieldAugment<T, F> tryCreateReflectionAugment(java.lang.Class<T> r6, java.lang.Class<? super F> r7, java.lang.String r8, F r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            java.lang.reflect.Field r0 = findField(r0, r1, r2)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L25
            r0 = r10
            java.lang.Class r0 = r0.getType()
            r1 = r7
            boolean r0 = typeIsAssignmentCompatible(r0, r1)
            if (r0 == 0) goto L25
            lombok.core.FieldAugment$ReflectionFieldAugment r0 = new lombok.core.FieldAugment$ReflectionFieldAugment
            r1 = r0
            r2 = r10
            r3 = r7
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
        L25:
            r0 = 0
            return r0
    }

    private static java.lang.reflect.Field findField(java.lang.Class<?> r3, java.lang.Class<?> r4, java.lang.String r5) {
            r0 = r3
            r1 = r5
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L2b
            r6 = r0
            r0 = r6
            int r0 = r0.getModifiers()     // Catch: java.lang.Exception -> L2b
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch: java.lang.Exception -> L2b
            if (r0 != 0) goto L1a
            r0 = r6
            int r0 = r0.getModifiers()     // Catch: java.lang.Exception -> L2b
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L1c
        L1a:
            r0 = 0
            return r0
        L1c:
            r0 = r6
            java.lang.Class r0 = r0.getType()     // Catch: java.lang.Exception -> L2b
            r1 = r4
            boolean r0 = typeIsAssignmentCompatible(r0, r1)     // Catch: java.lang.Exception -> L2b
            if (r0 != 0) goto L29
            r0 = 0
            return r0
        L29:
            r0 = r6
            return r0
        L2b:
            r0 = 0
            return r0
    }

    private static boolean typeIsAssignmentCompatible(java.lang.Class<?> r3, java.lang.Class<?> r4) {
            r0 = r3
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = r3
            r1 = r4
            if (r0 != r1) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = r3
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L1f
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L1d
            r0 = 1
            return r0
        L1d:
            r0 = 0
            return r0
        L1f:
            r0 = r4
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L34
            r0 = r3
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            if (r0 == r1) goto L32
            r0 = r3
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 != r1) goto L34
        L32:
            r0 = 1
            return r0
        L34:
            r0 = r4
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L49
            r0 = r3
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            if (r0 == r1) goto L47
            r0 = r3
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r0 != r1) goto L49
        L47:
            r0 = 1
            return r0
        L49:
            r0 = r4
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L5e
            r0 = r3
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            if (r0 == r1) goto L5c
            r0 = r3
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r0 != r1) goto L5e
        L5c:
            r0 = 1
            return r0
        L5e:
            r0 = r4
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L73
            r0 = r3
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            if (r0 == r1) goto L71
            r0 = r3
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r0 != r1) goto L73
        L71:
            r0 = 1
            return r0
        L73:
            r0 = r4
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L88
            r0 = r3
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            if (r0 == r1) goto L86
            r0 = r3
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            if (r0 != r1) goto L88
        L86:
            r0 = 1
            return r0
        L88:
            r0 = r4
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L9d
            r0 = r3
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            if (r0 == r1) goto L9b
            r0 = r3
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto L9d
        L9b:
            r0 = 1
            return r0
        L9d:
            r0 = r4
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto Lb2
            r0 = r3
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            if (r0 == r1) goto Lb0
            r0 = r3
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto Lb2
        Lb0:
            r0 = 1
            return r0
        Lb2:
            r0 = r4
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto Lc1
            r0 = r3
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r0 != r1) goto Lc1
            r0 = 1
            return r0
        Lc1:
            r0 = r3
            r1 = r4
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    private FieldAugment() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public abstract F get(T r1);

    public final void set(T r5, F r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.getAndSet(r1, r2)
            return
    }

    public abstract F getAndSet(T r1, F r2);

    public abstract F clear(T r1);

    public abstract F compareAndClear(T r1, F r2);

    public abstract F setIfAbsent(T r1, F r2);

    public abstract F compareAndSet(T r1, F r2, F r3);

    private static <T> T checkNotNull(T r4, java.lang.String r5) {
            r0 = r4
            if (r0 != 0) goto Ld
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        Ld:
            r0 = r4
            return r0
    }

    /* synthetic */ FieldAugment(lombok.core.FieldAugment r3) {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.Object access$1(java.lang.Object r3, java.lang.String r4) {
            r0 = r3
            r1 = r4
            java.lang.Object r0 = checkNotNull(r0, r1)
            return r0
    }
}
